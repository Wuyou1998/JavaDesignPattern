package com.wy.designPattern._07facadePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._07facadePattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/23,1:06
 * 描述: 外观模式测试类
 */
public class Main {
    public static void main(String[] args) {
        GirlCreator girlCreator=new GirlCreator();
        girlCreator.createTypeOneGirl();
        girlCreator.createTypeTwoGirl();
        girlCreator.createTypeThreeGirl();
    }
}
