package com.homework.pattern.factory.funct;


import com.homework.pattern.factory.Mengniu;
import com.homework.pattern.factory.Milk;

/**
 * Created by 15995 on 2018/5/16.
 */
public class MengniuFactory implements FunctionFactory {
    @Override
    public Milk create() {
        return new Mengniu();
    }
}
