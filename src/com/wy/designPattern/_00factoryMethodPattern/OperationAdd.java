package com.wy.designPattern._00factoryMethodPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._00factoryMethodPattern.OperationAdd
 * 用户: _VIEW
 * 时间: 2019/8/19,21:47
 * 描述: 加法类
 */
public class OperationAdd extends Operation {
    @Override
    public double operation() {
        return getNum_1()+getNum_2();
    }
}
