package com.wy.designPattern._01strategyPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._01strategyPattern.AddOperation
 * 用户: _VIEW
 * 时间: 2019/8/19,22:36
 * 描述: 加
 */
public class AddOperation implements Operation {
    @Override
    public double operation(double num1, double num2) {
        return num1+num2;
    }
}
