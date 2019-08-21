package com.wy.designPattern._04factoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._04factoryPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/21,21:45
 * 描述: 工厂模式测试类
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactory.getShape(Shapes.CIRCLE);
        Square square = ShapeFactory2.getShape(Square.class);
        circle.draw();
        square.draw();
    }
}
