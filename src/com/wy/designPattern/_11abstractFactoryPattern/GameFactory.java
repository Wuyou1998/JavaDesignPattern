package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.GameFactory
 * 用户: _VIEW
 * 时间: 2019/8/25,22:44
 * 描述: 游戏工厂
 */
public class GameFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Game getGame(String game) {
        if (game.equals("王者荣耀"))
            return new Game_1();
        if (game.equals("游戏1"))
            return new Game_2();
        if (game.equals("游戏2"))
            return new Game_3();
        return null;
    }
}
