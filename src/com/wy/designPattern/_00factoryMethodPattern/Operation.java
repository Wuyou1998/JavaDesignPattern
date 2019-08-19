package com.wy.designPattern._00factoryMethodPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._00factoryMethodPattern.Operation
 * 用户: _VIEW
 * 时间: 2019/8/19,21:38
 * 描述: 两个数运算抽象类
 */
public abstract class Operation {
    private double num_1=0;
    private double  num_2=0;

    public double getNum_1() {
        return num_1;
    }

    public void setNum_1(double num_1) {
        this.num_1 = num_1;
    }

    public double getNum_2() {
        return num_2;
    }

    public void setNum_2(double num_2) {
        this.num_2 = num_2;
    }

    public abstract double operation();
}
