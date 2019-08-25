package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.AbstractFactory
 * 用户: _VIEW
 * 时间: 2019/8/25,22:42
 * 描述: 抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Game getGame(String game);
}
