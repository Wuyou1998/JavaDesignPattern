package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._08builderPattern.ColdDrink
 * 用户: _VIEW
 * 时间: 2019/8/24,23:18
 * 描述: 冷饮类食物
 */
public abstract class ColdDrink implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
