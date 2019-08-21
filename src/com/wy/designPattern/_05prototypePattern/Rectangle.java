package com.wy.designPattern._05prototypePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._05prototypePattern.Rectabgle
 * 用户: _VIEW
 * 时间: 2019/8/21,22:21
 * 描述: 原型3
 */
public class Rectangle extends Shape {
    public Rectangle(String type) {
        super(type);
    }

    @Override
    public void draw() {
        System.out.println("这是一个"+super.getType());
    }
}
