package com.homework.pattern.strategy;

import com.homework.pattern.strategy.channel.ExpressType;

/**
 * Created by 15995 on 2018/5/22.
 */
public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order(1,"22389876536",2.34);
        ExpressResult result = order.pay(ExpressType.SR.getPayment());

        System.out.println(result);
    }

}
