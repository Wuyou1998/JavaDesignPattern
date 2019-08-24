package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._08builderPattern.Bottle
 * 用户: _VIEW
 * 时间: 2019/8/24,23:14
 * 描述: 饮料包装
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "装在瓶子里";
    }

    @Override
    public String toString() {
        return pack();
    }
}
