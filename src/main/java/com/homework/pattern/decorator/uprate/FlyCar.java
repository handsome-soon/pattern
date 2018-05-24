package com.homework.pattern.decorator.uprate;

import com.homework.pattern.decorator.old.Car;

/**
 * Created by 15995 on 2018/5/24.
 */
public class FlyCar extends SupserCar {
    public FlyCar(Car car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞呀飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
