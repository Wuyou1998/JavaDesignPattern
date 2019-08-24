package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._08builderPattern.VegBurger
 * 用户: _VIEW
 * 时间: 2019/8/24,23:20
 * 描述: 蔬菜汉堡
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 15;
    }
}
