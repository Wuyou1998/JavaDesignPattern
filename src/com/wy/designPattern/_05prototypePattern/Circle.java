package com.wy.designPattern._05prototypePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._05prototypePattern.Circle
 * 用户: _VIEW
 * 时间: 2019/8/21,22:14
 * 描述: 原型1
 */
public class Circle extends Shape {
    public Circle(String type) {
        super(type);
    }

    @Override
    public void draw() {
        System.out.println("这是一个" + super.getType());
    }
}
