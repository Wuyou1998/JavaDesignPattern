package com.wy.designPattern._19chainOfResponsbilityPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._19chainOfResponsbilityPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/30,21:38
 * 描述: 责任链模式测试
 */
public class Main {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getAbstractLogger();
        loggerChain.logMessage(AbstractLogger.INFO,"这是一条 INFO level 的消息");
        loggerChain.logMessage(AbstractLogger.DEBUG,"这是一条 DEBUG level 的消息");
        loggerChain.logMessage(AbstractLogger.ERROR,"这是一条 ERROR level 的消息");
    }

    private static AbstractLogger getAbstractLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.nextLogger = fileLogger;
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
