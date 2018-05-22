package com.homework.pattern.template;

/**
 * Created by 15995 on 2018/5/22.
 */
public class CookTemplateTest {


    public static void main(String[] args) {
        CookTemplate yuTang = new YuTangMian();
        CookTemplate gali = new GaliMian();

        yuTang.cook();
        gali.cook();

    }
}
