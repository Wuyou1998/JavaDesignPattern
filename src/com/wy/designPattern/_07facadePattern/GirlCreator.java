package com.wy.designPattern._07facadePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._07facadePattern.GirlCreator
 * 用户: _VIEW
 * 时间: 2019/8/23,1:04
 * 描述: 外观模式 妹子生成器
 */
public class GirlCreator {
    private Girl girl1;
    private Girl girl2;
    private Girl girl3;
    public GirlCreator(){
        girl1=new GirlTypeOne();
        girl2=new GirlTypeTwo();
        girl3=new GirlTypeThree();
    }
    public void createTypeOneGirl(){
        girl1.show();
    }
    public void createTypeTwoGirl(){
        girl2.show();
    }
    public void createTypeThreeGirl(){
        girl3.show();
    }
}
