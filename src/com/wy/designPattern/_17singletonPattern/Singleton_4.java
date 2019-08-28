package com.wy.designPattern._17singletonPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._17singletonPattern.Singleton_4
 * 用户: _VIEW
 * 时间: 2019/8/28,13:40
 * 描述: 双重检查模式
 */
public class Singleton_4 {
    private static volatile Singleton_4 singleton_4;

    private Singleton_4() {
    }

    public static Singleton_4 getInstance() {
        if (singleton_4 == null) {
            synchronized (Singleton_4.class) {
                if (singleton_4 == null)
                    singleton_4 = new Singleton_4();
            }
        }
        return singleton_4;
    }
}
