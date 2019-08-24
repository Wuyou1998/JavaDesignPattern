package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._08builderPattern.Coke
 * 用户: _VIEW
 * 时间: 2019/8/24,23:23
 * 描述: 普通可乐
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public float price() {
        return 3;
    }
}
