package com.homework.pattern.decorator.uprate;

import com.homework.pattern.decorator.old.Car;

/**
 * Created by 15995 on 2018/5/24.
 */
public class WaterCar extends SupserCar {
    public WaterCar(Car car) {
        super(car);
    }

    public void warter(){
        System.out.println("水上游啊游");
    }

    @Override
    public void move() {
        super.move();
        warter();
    }
}
