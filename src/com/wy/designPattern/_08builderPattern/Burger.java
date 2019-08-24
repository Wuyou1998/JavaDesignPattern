package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._08builderPattern.Burger
 * 用户: _VIEW
 * 时间: 2019/8/24,23:16
 * 描述: 汉堡类食物
 */
public abstract class Burger implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
