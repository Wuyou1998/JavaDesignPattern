package com.wy.designPattern._00factoryMethodPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._00factoryMethodPattern.OperationSub
 * 用户: _VIEW
 * 时间: 2019/8/19,21:48
 * 描述: 减法类
 */
public class OperationSub extends Operation {
    @Override
    public double operation() {
        return getNum_1() - getNum_2();
    }
}
