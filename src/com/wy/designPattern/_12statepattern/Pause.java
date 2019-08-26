package com.wy.designPattern._12statepattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._12statepattern.Pause
 * 用户: _VIEW
 * 时间: 2019/8/26,13:41
 * 描述: 暂停状态
 */
public class Pause implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("现在是暂停状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "pause";
    }
}
