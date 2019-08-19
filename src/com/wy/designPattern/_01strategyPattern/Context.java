package com.wy.designPattern._01strategyPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._01strategyPattern.Context
 * 用户: _VIEW
 * 时间: 2019/8/19,22:39
 * 描述: 上下文策略类
 */
public class Context {
    private Operation operation;
    public Context(Operation operation){
        this.operation=operation;
    }

    public double operate(double num1,double num2){
        return operation.operation(num1,num2);
    }
}
