package com.homework.pattern.strategy;

/**
 * Created by 15995 on 2018/5/22.
 */
public class Order {

    private int uid;

    private String orderId;

    private double weight;


    public Order(int uid, String orderId, double weight) {
        this.uid = uid;
        this.orderId = orderId;
        this.weight = weight;
    }

    public ExpressResult pay(ExpressState payment){
        return payment.excute(uid,weight);
    }

}
