package com.wy.designPattern._04factoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._04factoryPattern.ShapeFactory
 * 用户: _VIEW
 * 时间: 2019/8/21,21:34
 * 描述: 产生对象的工厂
 */
public class ShapeFactory {
    public static Shape getShape(Shapes shapes) {
        Shape shape = null;
        switch (shapes) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}
