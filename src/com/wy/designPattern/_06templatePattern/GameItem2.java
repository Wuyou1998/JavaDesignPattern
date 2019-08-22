package com.wy.designPattern._06templatePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._06templatePattern.GameItem2
 * 用户: _VIEW
 * 时间: 2019/8/23,0:43
 * 描述: 游戏2
 */
public class GameItem2 extends Game {
    @Override
    public void init() {
        System.out.println("初始化游戏2");
    }

    @Override
    public void start() {
        System.out.println("游戏2开始");
    }

    @Override
    public void end() {
        System.out.println("游戏2结束");
    }
}
