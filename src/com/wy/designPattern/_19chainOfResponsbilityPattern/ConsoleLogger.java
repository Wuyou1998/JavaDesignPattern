package com.wy.designPattern._19chainOfResponsbilityPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._19chainOfResponsbilityPattern.ConsoleLogger
 * 用户: _VIEW
 * 时间: 2019/8/30,21:34
 * 描述: 实体类 1
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger: " + message);
    }
}
