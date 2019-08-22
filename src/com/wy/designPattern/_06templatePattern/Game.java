package com.wy.designPattern._06templatePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._06templatePattern.Game
 * 用户: _VIEW
 * 时间: 2019/8/23,0:39
 * 描述: 游戏模板类
 */
public abstract class Game {
    public abstract void init();
    public abstract void start();
    public abstract void end();
    public final void play(){
        init();
        start();
        end();
    }
}
