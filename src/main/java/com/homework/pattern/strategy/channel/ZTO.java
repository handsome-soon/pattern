package com.homework.pattern.strategy.channel;

import com.homework.pattern.strategy.ExpressResult;
import com.homework.pattern.strategy.ExpressState;

/**
 * Created by 15995 on 2018/5/22.
 */
public class ZTO implements ExpressState {
    @Override
    public ExpressResult excute(int uid, double weight) {
        System.out.println("欢迎使用中通");
        return new ExpressResult(200,"下单成功",weight);
    }
}
