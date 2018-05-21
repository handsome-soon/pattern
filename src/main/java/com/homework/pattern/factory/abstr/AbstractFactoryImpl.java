package com.homework.pattern.factory.abstr;


import com.homework.pattern.factory.Milk;
import com.homework.pattern.factory.funct.GuangmingFactroy;
import com.homework.pattern.factory.funct.MengniuFactory;
import com.homework.pattern.factory.funct.YiliFactory;

/**
 * Created by 15995 on 2018/5/16.
 */
public class AbstractFactoryImpl extends AbstractFactory {
    @Override
    Milk createMengniu() {
        return new MengniuFactory().create();
    }

    @Override
    Milk createYili() {
        return new YiliFactory().create();
    }

    @Override
    Milk createGuangming() {
        return new GuangmingFactroy().create();
    }
}
