package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.FactoryProducer
 * 用户: _VIEW
 * 时间: 2019/8/25,22:48
 * 描述: 工厂生成器类
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String name){
        if (name.equalsIgnoreCase("GAME"))
            return new GameFactory();
        if (name.equalsIgnoreCase("COLOR"))
            return new ColorFactory();
        return null;
    }
}
