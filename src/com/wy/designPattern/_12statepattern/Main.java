package com.wy.designPattern._12statepattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._12statepattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/26,13:48
 * 描述: 状态模式测试类
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        State stateStart = new Start();
        State statePause = new Pause();
        State stateStop = new Stop();
        stateStart.doAction(context);
        System.out.println(context.getState());
        statePause.doAction(context);
        System.out.println(context.getState());
        stateStop.doAction(context);
        System.out.println(context.getState());
    }
}
