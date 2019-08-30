package com.wy.designPattern._19chainOfResponsbilityPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._19chainOfResponsbilityPattern.FileLogger
 * 用户: _VIEW
 * 时间: 2019/8/30,21:37
 * 描述: 实体类 3
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger: " + message);
    }
}
