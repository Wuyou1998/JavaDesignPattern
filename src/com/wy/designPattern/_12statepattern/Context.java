package com.wy.designPattern._12statepattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._12statepattern.Context
 * 用户: _VIEW
 * 时间: 2019/8/26,13:43
 * 描述: 上下文类 用于切换状态
 */
public class Context {
    private State state;
    public Context(){
        state=null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
