package com.wy.designPattern._17singletonPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._17singletonPattern.Sinngleton_5
 * 用户: _VIEW
 * 时间: 2019/8/28,13:43
 * 描述: 静态内部类单例模式,推荐使用
 */
public class Singleton_5 {
    private Singleton_5() {

    }

    public static Singleton_5 getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton_5 sInstance = new Singleton_5();
    }
}
