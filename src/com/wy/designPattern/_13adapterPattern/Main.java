package com.wy.designPattern._13adapterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._13adapterPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/26,14:24
 * 描述: 适配器模式测试类
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "自由飞翔");
        audioPlayer.play("mp4", "迪丽热巴老师的特别辅导");
        audioPlayer.play("vlc", "我和三上悠亚不得不说的故事");
    }
}
