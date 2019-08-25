package com.wy.designPattern._10observerPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._10observerPattern.SecondObserver
 * 用户: _VIEW
 * 时间: 2019/8/25,20:39
 * 描述: 第二个观察者
 */
public class SecondObserver extends Observer {
    public SecondObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + "的状态更新为: " + subject.getState());
    }
}
