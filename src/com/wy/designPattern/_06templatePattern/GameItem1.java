package com.wy.designPattern._06templatePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._06templatePattern.GameItem1
 * 用户: _VIEW
 * 时间: 2019/8/23,0:42
 * 描述: 游戏1
 */
public class GameItem1 extends Game {
    @Override
    public void init() {
        System.out.println("初始化游戏1");
    }

    @Override
    public void start() {
        System.out.println("游戏1开始");
    }

    @Override
    public void end() {
        System.out.println("游戏1结束");
    }
}
