package com.wy.designPattern._21flyweightPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._21flyweightPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/30,22:43
 * 描述: 享元模式测试类
 */
public class Main {
    private static final String[] colors = {"Red", "Yellow", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[getRandomColor()]);
            circle.setX(getRandomXY());
            circle.setY(getRandomXY());
            circle.setRadius(getRandomXY());
            circle.draw();
        }
    }

    private static int getRandomXY() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomColor() {
        return (int) (Math.random() * colors.length);
    }
}
