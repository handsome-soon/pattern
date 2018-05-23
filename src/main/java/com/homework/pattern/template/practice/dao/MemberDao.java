package com.homework.pattern.template.practice.dao;

import com.homework.pattern.template.practice.JdbcTemplate;
import com.homework.pattern.template.practice.RowMapper;
import com.homework.pattern.template.practice.entity.Member;

import java.sql.ResultSet;
import java.util.List;


/**
 * Created by 15995 on 2018/5/22.
 */
public class MemberDao {
    //为什么不继承，主要是为了解耦
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query(){
        String sql = "select * from t_member";
        return jdbcTemplate.excute(sql,null,new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setName(rs.getString("name"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        });


    }
}
