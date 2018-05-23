package com.homework.pattern.adapter;

/**
 * Created by lixia on 2018/5/23.
 */
public class AdapterPlayer extends Mp3Player implements MediaPlay {

    @Override
    public void play(String fileName) {
        super.play(fileName);
    }
}
