package com.wy.designPattern._09bridgePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._09bridgePattern.Circle
 * 用户: _VIEW
 * 时间: 2019/8/29,21:39
 * 描述: 继承自shape，产生圆
 */
public class Circle extends Shape {
    private int x, y, radius;

    protected Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
