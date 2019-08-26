package com.wy.designPattern._13adapterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._13adapterPattern.VLCPlayer
 * 用户: _VIEW
 * 时间: 2019/8/26,14:11
 * 描述: VLC播放器
 */
public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("正在播放VLC文件: "+fileName);
    }

    @Override
    public void playMP4(String fileName) {
        //空实现
    }
}
