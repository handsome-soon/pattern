package com.homework.pattern.template.practice;

import java.sql.ResultSet;

/**
 * Created by 15995 on 2018/5/22.
 */
public interface RowMapper<T> {

    public T mapRow(ResultSet rs, int rowNum) throws Exception;

}
