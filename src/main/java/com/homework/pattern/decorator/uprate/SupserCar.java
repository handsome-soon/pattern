package com.homework.pattern.decorator.uprate;

import com.homework.pattern.decorator.old.Car;
import com.homework.pattern.decorator.old.ICar;

import java.util.Calendar;

/**
 * Created by 15995 on 2018/5/24.
 */
public class SupserCar implements ICar {

    Car car ;

    public SupserCar(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
