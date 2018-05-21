package com.homework.pattern.factory.simple;


import com.homework.pattern.factory.Milk;

/**
 * Created by 15995 on 2018/5/16.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Milk milk = simpleFactory.getMilk("蒙牛");
        System.out.println(milk.getName());
    }

}
