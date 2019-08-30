package com.wy.designPattern._19chainOfResponsbilityPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._19chainOfResponsbilityPattern.ErrorLogger
 * 用户: _VIEW
 * 时间: 2019/8/30,21:36
 * 描述: 实体类 2
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger: " + message);
    }
}
