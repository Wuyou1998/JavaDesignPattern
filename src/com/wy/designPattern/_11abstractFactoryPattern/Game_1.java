package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.Game_1
 * 用户: _VIEW
 * 时间: 2019/8/25,22:09
 * 描述: 游戏1
 */
public class Game_1 implements Game {
    @Override
    public void play() {
        System.out.println("欢迎来到王者荣耀");
    }
}
