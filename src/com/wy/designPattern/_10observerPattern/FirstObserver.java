package com.wy.designPattern._10observerPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._10observerPattern.FirstObserver
 * 用户: _VIEW
 * 时间: 2019/8/25,20:37
 * 描述: 第一个观察者
 */
public class FirstObserver extends Observer {
    public FirstObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + "的状态更新为: " + subject.getState());
    }
}
