package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.ColorFactory
 * 用户: _VIEW
 * 时间: 2019/8/25,22:45
 * 描述: 颜色工厂
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color.equals("红色"))
            return new Red();
        if (color.equals("蓝色"))
            return new Blue();
        if (color.equals("黄色"))
            return new Yellow();
        return null;
    }

    @Override
    public Game getGame(String game) {
        return null;
    }
}
