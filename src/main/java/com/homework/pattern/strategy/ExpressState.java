package com.homework.pattern.strategy;

/**
 * Created by 15995 on 2018/5/22.
 */
public interface ExpressState {

    public ExpressResult excute(int uid, double weight);

}
