package com.homework.pattern.decorator;

import com.homework.pattern.decorator.old.Car;
import com.homework.pattern.decorator.old.ICar;
import com.homework.pattern.decorator.uprate.AICar;
import com.homework.pattern.decorator.uprate.FlyCar;
import com.homework.pattern.decorator.uprate.WaterCar;

/**
 * Created by 15995 on 2018/5/24.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Car car = new Car();
        car.move();
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();
        AICar aiCar = new AICar(car);
        aiCar.move();



    }

}
