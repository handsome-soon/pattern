package com.homework.pattern.decorator.uprate;

import com.homework.pattern.decorator.old.Car;

/**
 * Created by 15995 on 2018/5/24.
 */
public class AICar extends SupserCar {
    public AICar(Car car) {
        super(car);
    }

    public void ai(){
        System.out.println("只能跑");
    }

    @Override
    public void move() {
        super.move();
        ai();
    }
}
