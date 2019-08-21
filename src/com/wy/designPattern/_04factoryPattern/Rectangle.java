package com.wy.designPattern._04factoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._04factoryPattern.Rectangle
 * 用户: _VIEW
 * 时间: 2019/8/21,21:33
 * 描述: 对象3 长方形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("生产了一个长方形");
    }
}
