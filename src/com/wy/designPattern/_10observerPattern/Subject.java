package com.wy.designPattern._10observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._10observerPattern.Subject
 * 用户: _VIEW
 * 时间: 2019/8/25,20:33
 * 描述: 被观察者类
 */
public class Subject {
    private List<Observer> observers=new ArrayList<>();
    private String state;

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public String getState() {
        return state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        if (observers.size()==0){
            return;
        }
        for (Observer observer:observers){
            observer.update();
        }
    }
}
