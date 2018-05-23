package com.homework.pattern.template.practice;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15995 on 2018/5/22.
 */
public class JdbcTemplate {


    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getConnection()throws  Exception{
        return dataSource.getConnection();
    }

    private  PreparedStatement getPreparedStatement(Connection connection,String sql)throws  Exception{
        return connection.prepareStatement(sql);
    }

    private ResultSet getResultSet(PreparedStatement preparedStatement,Object[] objects)throws  Exception{
        for (int i=0;i<objects.length;i++){
            preparedStatement.setObject(i,objects[i]);
        }
        return preparedStatement.executeQuery();
    }

    private void closeStatement(PreparedStatement preparedStatement) throws  Exception{
        preparedStatement.close();
    }

    private void closeResultSet(ResultSet rs) throws  Exception{
        rs.close();
    }

    private void closeConnection(Connection conn) throws  Exception{
        //通常把它放到连接池回收
    }


    private List<?> parseResultSet(ResultSet rs,RowMapper rowMapper) throws  Exception{
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum ++));
        }
        return result;
    }


    public List<?> excute(String sql, Object[] values,RowMapper rowMapper){
        try {

            //1、获取连接
            Connection conn = this.getConnection();
            //2、创建语句集
            PreparedStatement pstmt = this.getPreparedStatement(conn,sql);
            //3、执行语句集，并且获得结果集
            ResultSet rs = this.getResultSet(pstmt,values);
            //4、解析语句集
            List<?> result = this.parseResultSet(rs,rowMapper);

            //5、关闭结果集
            this.closeResultSet(rs);
            //6、关闭语句集
            this.closeStatement(pstmt);
            //7、关闭连接
            this.closeConnection(conn);

            return result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

}
