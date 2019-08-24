package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._08builderPattern.ChickenBurger
 * 用户: _VIEW
 * 时间: 2019/8/24,23:21
 * 描述: 鸡肉汉堡
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 25;
    }
}
