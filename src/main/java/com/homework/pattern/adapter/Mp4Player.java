package com.homework.pattern.adapter;

/**
 * Created by lixia on 2018/5/23.
 */
public class Mp4Player implements MediaPlay {
    @Override
    public void play(String fileName) {
        System.out.println("正在播放MP4格式文件："+fileName);
    }
}
