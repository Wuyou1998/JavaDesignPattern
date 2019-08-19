package com.wy.designPattern._00factoryMethodPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._00factoryMethodPattern.OperationMul
 * 用户: _VIEW
 * 时间: 2019/8/19,21:48
 * 描述: 乘法类
 */
public class OperationMul extends Operation {
    @Override
    public double operation() {
        return getNum_1()*getNum_2();
    }
}
