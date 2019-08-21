package com.wy.designPattern._05prototypePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._05prototypePattern.Square
 * 用户: _VIEW
 * 时间: 2019/8/21,22:19
 * 描述: 原型2
 */
public class Square extends Shape {
    public Square(String type) {
        super(type);
    }

    @Override
    public void draw() {
        System.out.println("这是一个"+super.getType());
    }
}
