package com.wy.designPattern._17singletonPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._17singletonPattern.Singleton_1
 * 用户: _VIEW
 * 时间: 2019/8/28,13:34
 * 描述: 饿汉模式
 */
public class Singleton_1 {
    private static Singleton_1 singleton_1 = new Singleton_1();

    private Singleton_1() {
    }

    public static Singleton_1 getInstance() {
        return singleton_1;
    }
}
