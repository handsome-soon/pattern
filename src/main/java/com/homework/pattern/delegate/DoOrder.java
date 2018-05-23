package com.homework.pattern.delegate;

/**
 * Created by 15995 on 2018/5/23.
 */
public class DoOrder implements Ido {
    @Override
    public void doing() {
        System.out.println("now is doing order");
    }
}
