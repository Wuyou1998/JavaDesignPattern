package com.wy.designPattern._13adapterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._13adapterPattern.AdvancedMediaPlayer
 * 用户: _VIEW
 * 时间: 2019/8/26,14:10
 * 描述: 高级播放器，具备播放VLC和MP4功能
 */
public interface AdvancedMediaPlayer {
    void playVLC(String fileName);

    void playMP4(String fileName);
}
