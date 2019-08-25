package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.Yellow
 * 用户: _VIEW
 * 时间: 2019/8/25,22:40
 * 描述: 黄色
 */
public class Yellow implements Color {
    @Override
    public void draw() {
        System.out.println("这是黄色");
    }
}
