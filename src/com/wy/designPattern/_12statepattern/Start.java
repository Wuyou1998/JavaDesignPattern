package com.wy.designPattern._12statepattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._12statepattern.Start
 * 用户: _VIEW
 * 时间: 2019/8/26,13:41
 * 描述: 开始状态
 */
public class Start implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("现在是开始状态");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start";
    }
}
