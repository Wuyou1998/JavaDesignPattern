package com.wy.designPattern._01strategyPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._01strategyPattern.MulOperation
 * 用户: _VIEW
 * 时间: 2019/8/19,22:37
 * 描述: 乘
 */
public class MulOperation implements Operation {
    @Override
    public double operation(double num1, double num2) {
        return num1*num2;
    }
}
