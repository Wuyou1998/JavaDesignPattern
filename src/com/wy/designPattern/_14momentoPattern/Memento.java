package com.wy.designPattern._14momentoPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._14momentoPattern.Memento
 * 用户: _VIEW
 * 时间: 2019/8/27,15:17
 * 描述: 备忘录类，包含了要被恢复的对象的状态
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
