package com.wy.designPattern._10observerPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._10observerPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/25,20:41
 * 描述: 观察者模式测试类
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new FirstObserver(subject);
        new SecondObserver(subject);
        System.out.println("被观察者的状态为： 123");
        subject.setState("123");
        System.out.println("被观察者的状态又变为： 456");
        subject.setState("456");
    }
}
