package com.wy.designPattern._23visitorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._23visitorPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/31,0:17
 * 描述: 访问者模式 测试类
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
