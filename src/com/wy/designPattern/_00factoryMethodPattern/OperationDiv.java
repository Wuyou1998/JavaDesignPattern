package com.wy.designPattern._00factoryMethodPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._00factoryMethodPattern.OperationDiv
 * 用户: _VIEW
 * 时间: 2019/8/19,21:49
 * 描述: 除法类
 */
public class OperationDiv extends Operation {
    @Override
    public double operation() {
        return getNum_1()/getNum_2();
    }
}
