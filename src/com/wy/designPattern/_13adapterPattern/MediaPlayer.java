package com.wy.designPattern._13adapterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._13adapterPattern.MediaPlayer
 * 用户: _VIEW
 * 时间: 2019/8/26,14:08
 * 描述: 普通播放器，只有播放mp3功能
 */
public interface MediaPlayer {
    void play(String type,String fileName);
}
