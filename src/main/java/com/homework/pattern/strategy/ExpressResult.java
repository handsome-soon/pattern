package com.homework.pattern.strategy;

/**
 * Created by 15995 on 2018/5/22.
 */
public class ExpressResult {

    private  int code;

    private  String message;

    private  Object data;

    public ExpressResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String toString(){
        return ("支付状态：[" + code + "]," + message + ",交易详情：" + data);
    }

}
