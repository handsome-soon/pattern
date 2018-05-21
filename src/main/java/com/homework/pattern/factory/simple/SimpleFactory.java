package com.homework.pattern.factory.simple;

import com.homework.pattern.factory.Guangming;
import com.homework.pattern.factory.Mengniu;
import com.homework.pattern.factory.Milk;
import com.homework.pattern.factory.Yili;

/**
 * Created by 15995 on 2018/5/16.
 */
public class SimpleFactory {

    Milk getMilk(String name){
        if("蒙牛".equals(name)){
            return  new Mengniu();
        }else if ("伊利".equals(name)){
            return  new Yili();
        }else if("光明".equals(name)){
            return  new Guangming();
        }
        return  null;
    }
}
