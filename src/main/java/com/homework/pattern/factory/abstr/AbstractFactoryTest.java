package com.homework.pattern.factory.abstr;


import com.homework.pattern.factory.Milk;

/**
 * Created by 15995 on 2018/5/16.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactoryImpl();
        Milk guangming = abstractFactory.createGuangming();
        System.out.println(guangming.getName());
    }

}
