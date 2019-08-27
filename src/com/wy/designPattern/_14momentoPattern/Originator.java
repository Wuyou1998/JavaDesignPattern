package com.wy.designPattern._14momentoPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._14momentoPattern.Originator
 * 用户: _VIEW
 * 时间: 2019/8/27,15:19
 * 描述: 要保存状态在Memento中的对象
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateToMemento(Memento memento) {
        state = memento.getState();
    }
}
