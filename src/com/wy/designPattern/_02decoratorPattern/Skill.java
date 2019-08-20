package com.wy.designPattern._02decoratorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._02decoratorPattern.Skill
 * 用户: _VIEW
 * 时间: 2019/8/20,17:01
 * 描述: 技能类，持有一个hero对象
 */
public abstract class Skill implements Hero {
    private Hero hero;

    public Skill(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkill() {
        if (hero != null)
            hero.learnSkill();
    }
}
