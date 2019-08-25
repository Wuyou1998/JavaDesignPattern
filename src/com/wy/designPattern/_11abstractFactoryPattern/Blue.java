package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.Blue
 * 用户: _VIEW
 * 时间: 2019/8/25,22:40
 * 描述: 蓝色
 */
public class Blue implements Color {
    @Override
    public void draw() {
        System.out.println("这是蓝色");
    }
}
