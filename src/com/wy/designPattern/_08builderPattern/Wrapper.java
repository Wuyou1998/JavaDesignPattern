package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._08builderPattern.Wrapper
 * 用户: _VIEW
 * 时间: 2019/8/24,23:12
 * 描述: 食物包装
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "包裹在盒子里";
    }

    @Override
    public String toString() {
        return pack();
    }
}
