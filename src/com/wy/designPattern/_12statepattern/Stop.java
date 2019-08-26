package com.wy.designPattern._12statepattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._12statepattern.Stop
 * 用户: _VIEW
 * 时间: 2019/8/26,13:42
 * 描述: 停止状态
 */
public class Stop implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("现在是停止状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop";
    }
}
