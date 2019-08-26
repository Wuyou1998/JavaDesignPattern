package com.wy.designPattern._13adapterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._13adapterPattern.MP4Player
 * 用户: _VIEW
 * 时间: 2019/8/26,14:13
 * 描述: MP4播放器
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        //空实现
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("正在播放MP4文件: " + fileName);
    }
}
