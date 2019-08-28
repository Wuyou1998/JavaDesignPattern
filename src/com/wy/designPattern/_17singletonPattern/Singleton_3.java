package com.wy.designPattern._17singletonPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._17singletonPattern.Singleton_3
 * 用户: _VIEW
 * 时间: 2019/8/28,13:38
 * 描述: 懒汉模式 线程安全
 */
public class Singleton_3 {
    private static Singleton_3 singleton_3;

    private Singleton_3() {
    }

    public static synchronized Singleton_3 getInstance() {
        if (singleton_3 == null)
            singleton_3 = new Singleton_3();
        return singleton_3;
    }
}
