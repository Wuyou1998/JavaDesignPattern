package com.wy.designPattern._05prototypePattern;

import java.util.HashMap;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._05prototypePattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/21,22:23
 * 描述: 原型模式测试类
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, Shape> hashMap = getCache();
        Circle circle = (Circle) hashMap.get("1").clone();
        Square square = (Square) hashMap.get("2").clone();
        Rectangle rectangle = (Rectangle) hashMap.get("3").clone();

        circle.draw();
        square.draw();
        rectangle.draw();
    }

    private static HashMap<String, Shape> getCache() {
        HashMap<String, Shape> hashMap = new HashMap<>();
        Circle circle = new Circle("Circle");
        circle.setId("1");
        circle.setType("clone Circle");
        Square square = new Square("Square");
        square.setId("2");
        Rectangle rectangle = new Rectangle("Rectangle");
        rectangle.setId("3");
        hashMap.put(circle.getId(), circle);
        hashMap.put(square.getId(), square);
        hashMap.put(rectangle.getId(), rectangle);
        return hashMap;
    }
}
