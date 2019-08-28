package com.wy.designPattern._17singletonPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._17singletonPattern.Singleton_2
 * 用户: _VIEW
 * 时间: 2019/8/28,13:36
 * 描述: 懒汉模式 线程不安全
 */
public class Singleton_2 {
    private static Singleton_2 singleton_2;

    private Singleton_2() {
    }

    public static Singleton_2 getInstance() {
        if (singleton_2 == null)
            singleton_2 = new Singleton_2();
        return singleton_2;
    }
}
