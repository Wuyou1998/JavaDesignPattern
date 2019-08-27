package com.wy.designPattern._14momentoPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._14momentoPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/27,15:25
 * 描述: 备忘录模式测试
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTacker careTacker = new CareTacker();
        originator.setState("第1次的状态");
        originator.setState("第2次的状态");
        careTacker.add(originator.saveStateToMemento());
        originator.setState("第3次的状态");
        careTacker.add(originator.saveStateToMemento());
        originator.setState("第4次的状态");
        System.out.println("当前状态是: " + originator.getState());
        originator.getStateToMemento(careTacker.get(0));
        System.out.println("恢复成第1次保存的状态: " + originator.getState());
        originator.getStateToMemento(careTacker.get(1));
        System.out.println("恢复成第2次保存的状态: " + originator.getState());
    }
}
