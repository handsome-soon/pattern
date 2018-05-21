package com.homework.pattern.factory.funct;


import com.homework.pattern.factory.Milk;

/**
 * Created by 15995 on 2018/5/16.
 */
public class FunctionFactroyTest {

    public static void main(String[] args) {
        FunctionFactory factory = new MengniuFactory();
        Milk milk = factory.create();
        System.out.println(milk.getName());
    }
}
