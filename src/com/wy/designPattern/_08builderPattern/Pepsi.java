package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._b08uilderpattern.pepsi
 * 用户: _VIEW
 * 时间: 2019/8/24,23:23
 * 描述: 百事可乐
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 5;
    }
}
