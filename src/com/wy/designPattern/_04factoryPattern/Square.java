package com.wy.designPattern._04factoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._04factoryPattern.Square
 * 用户: _VIEW
 * 时间: 2019/8/21,21:32
 * 描述: 对象2 正方形
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("生产了一个正方形");
    }
}
