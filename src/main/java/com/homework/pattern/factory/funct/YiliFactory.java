package com.homework.pattern.factory.funct;


import com.homework.pattern.factory.Milk;
import com.homework.pattern.factory.Yili;

/**
 * Created by 15995 on 2018/5/16.
 */
public class YiliFactory implements FunctionFactory {
    @Override
    public Milk create() {
        return new Yili();
    }
}
