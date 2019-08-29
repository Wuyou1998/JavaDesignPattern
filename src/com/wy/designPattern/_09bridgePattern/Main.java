package com.wy.designPattern._09bridgePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._09bridgePattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/29,21:42
 * 描述: 桥接模式测试类
 */
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 10, 10, 8);
        Shape greenCircle = new Circle(new GreenCircle(), 20, 20, 6);

        redCircle.draw();
        greenCircle.draw();
    }
}
