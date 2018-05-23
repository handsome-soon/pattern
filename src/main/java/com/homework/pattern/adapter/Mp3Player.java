package com.homework.pattern.adapter;

/**
 * Created by lixia on 2018/5/23.
 * 原始类播放MP3格式文件，不可改变
 */
public class Mp3Player {

    public void play(String fileName){
        System.out.println("正在播放MP3格式文件："+fileName);
    }
}
