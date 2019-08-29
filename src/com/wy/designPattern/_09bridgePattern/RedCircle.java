package com.wy.designPattern._09bridgePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._09bridgePattern.RedCircle
 * 用户: _VIEW
 * 时间: 2019/8/29,21:32
 * 描述: 实现了接口的类
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画了一个红圆： radius：" + radius + " x: " + x + " y: " + y);
    }
}
