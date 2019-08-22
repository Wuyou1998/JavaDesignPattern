package com.wy.designPattern._06templatePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._06templatePattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/23,0:44
 * 描述: 模版模式测试类
 */
public class Main {
    public static void main(String[] args) {
        Game game1=new GameItem1();
        game1.play();
        Game game2=new GameItem2();
        game2.play();
    }
}
