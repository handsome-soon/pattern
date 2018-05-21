package com.homework.pattern.factory.funct;


import com.homework.pattern.factory.Guangming;
import com.homework.pattern.factory.Milk;

/**
 * Created by 15995 on 2018/5/16.
 */
public class GuangmingFactroy implements FunctionFactory {
    @Override
    public Milk create() {
        return new Guangming();
    }
}
