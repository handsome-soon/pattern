package com.homework.pattern.adapter;

/**
 * Created by lixia on 2018/5/23.
 */
public class AdapterTest {

    public static void main(String[] args) {
        MediaPlay player = new AdapterPlayer();
        player.play("zhangsan6789");
        player = new Mp4Player();
        player.play("67878888");
        player = new AVGPlayer();
        player.play("7778888998");



        
    }
}
