package com.homework.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 15995 on 2018/5/23.
 */
public class DispatchShopping {

    Map<String,Ido> map = new HashMap<>();

    public DispatchShopping() {
        map.put("order",new DoOrder());
        map.put("pay",new DoPay());
        map.put("express",new DoExpress());
    }

    public void shop(){
        map.get("order").doing();
        map.get("pay").doing();
        map.get("express").doing();
    }



}
