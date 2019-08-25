package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.Red
 * 用户: _VIEW
 * 时间: 2019/8/25,22:39
 * 描述: 红色
 */
public class Red implements Color {
    @Override
    public void draw() {
        System.out.println("这是红色");
    }
}
