package com.wy.designPattern._10observerPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._10observerPattern.Observer
 * 用户: _VIEW
 * 时间: 2019/8/25,20:31
 * 描述: 观察者接口类
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
