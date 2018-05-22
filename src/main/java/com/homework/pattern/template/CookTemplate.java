package com.homework.pattern.template;

/**
 * Created by 15995 on 2018/5/22.
 */
public abstract class CookTemplate {

    private void washVegetable(){
        System.out.println("洗菜");
    }

    private void ignition(){
        System.out.println("点火");
    }

    private void putDishes(){
        System.out.println("放菜");
    }

    public abstract void putCondiment();

    private void shutDown(){
        System.out.println("熄火");
    }

    public void cook(){
        //1、洗菜
        washVegetable();
        //2、点火
        ignition();
        //3、放菜
        putDishes();
        //4、放调料
        putCondiment();
        //5、熄火
        shutDown();

    }

}
