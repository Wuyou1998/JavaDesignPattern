package com.wy.designPattern._21flyweightPattern;

import java.util.HashMap;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._21flyweightPattern.ShapeFactory
 * 用户: _VIEW
 * 时间: 2019/8/30,22:38
 * 描述: 工厂类，生成基于给定信息的实体类对象
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> hashMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) hashMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            hashMap.put(color, circle);
            System.out.println("**********创建了一个" + color + "的新圆**********");
        }
        return circle;
    }
}
