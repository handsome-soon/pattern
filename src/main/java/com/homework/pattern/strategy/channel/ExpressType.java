package com.homework.pattern.strategy.channel;

import com.homework.pattern.strategy.ExpressState;

/**
 * Created by 15995 on 2018/5/22.
 */
public enum ExpressType {

    ZTO(new ZTO()),
    SR(new SR()),
    YTO(new YTO()),
    STO(new STO()),

    ;

    private ExpressState payment;

    ExpressType(ExpressState payment) {
        this.payment = payment;
    }

    public ExpressState getPayment(){
        return this.payment;
    }

}
