package com.homework.pattern.factory.abstr;


import com.homework.pattern.factory.Milk;

/**
 * Created by 15995 on 2018/5/16.
 */
public abstract class AbstractFactory {

    //public method add
    abstract Milk createMengniu();

    abstract Milk createYili();

    abstract  Milk createGuangming();

}
