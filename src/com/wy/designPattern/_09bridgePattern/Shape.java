package com.wy.designPattern._09bridgePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._09bridgePattern.Shape
 * 用户: _VIEW
 * 时间: 2019/8/29,21:36
 * 描述: 桥接DrawAPI，画圆
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
