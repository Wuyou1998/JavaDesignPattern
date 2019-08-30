package com.wy.designPattern._19chainOfResponsbilityPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._19chainOfResponsbilityPattern.AbstractLogger
 * 用户: _VIEW
 * 时间: 2019/8/30,21:27
 * 描述: 抽象的记录器类
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    protected int level;
    //责任链的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level)
            write(message);
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
