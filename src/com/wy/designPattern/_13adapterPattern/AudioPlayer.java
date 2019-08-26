package com.wy.designPattern._13adapterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._13adapterPattern.AudioPlayer
 * 用户: _VIEW
 * 时间: 2019/8/26,14:19
 * 描述: 暴露给客户端使用的播放器。
 *      通过adapter给只能播MP3的播放器添加播放VLC MP4的功能
 */
public class AudioPlayer implements MediaPlayer {
    private PlayerAdapter playerAdapter = new PlayerAdapter();

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("MP3")) {
            System.out.println("正在播放MP3文件: " + fileName);
        }
        if (type.equalsIgnoreCase("VLC")) {
            playerAdapter.play("VLC", fileName);
        }

        if (type.equalsIgnoreCase("MP4")) {
            playerAdapter.play("MP4", fileName);
        }
    }
}
