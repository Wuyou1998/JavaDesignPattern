package com.wy.designPattern._02decoratorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._02decoratorPattern.YaoJin
 * 用户: _VIEW
 * 时间: 2019/8/20,16:59
 * 描述: 王者荣耀英雄 程咬金
 */
public class YaoJin implements Hero {
    @Override
    public void learnSkill() {
        System.out.println("咬金学会了以下技能后大喊一声：好舒服啊！");
    }
}
