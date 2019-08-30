package com.wy.designPattern._21flyweightPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._21flyweightPattern.Circle
 * 用户: _VIEW
 * 时间: 2019/8/30,22:34
 * 描述: 实体类
 */
public class Circle implements Shape {
    private String color;
    private int x, y, radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("画了一个圆: Color: " + color + " X: " + x + " Y: " + y + " Radius: " + radius);
    }
}
