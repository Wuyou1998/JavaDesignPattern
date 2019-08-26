package com.wy.designPattern._13adapterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._13adapterPattern.PlayerAdapter
 * 用户: _VIEW
 * 时间: 2019/8/26,14:14
 * 描述: 整合功能，使其能播放MP4，VLC文件
 */
public class PlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

//    public PlayerAdapter(String type) {
//        if (type.equalsIgnoreCase("VLC"))
//
//        if (type.equalsIgnoreCase("MP4"))
//            this.advancedMediaPlayer = new MP4Player();
//    }

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("VLC")){
            advancedMediaPlayer = new VLCPlayer();
            advancedMediaPlayer.playVLC(fileName);
        }

        if (type.equalsIgnoreCase("MP4")){
            advancedMediaPlayer = new MP4Player();
            advancedMediaPlayer.playMP4(fileName);
        }

    }
}
