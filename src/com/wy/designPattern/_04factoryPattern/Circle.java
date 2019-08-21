package com.wy.designPattern._04factoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._04factoryPattern.Circle
 * 用户: _VIEW
 * 时间: 2019/8/21,21:31
 * 描述: 对象1 圆
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("生产了一个圆");
    }
}
