package com.wy.designPattern._02decoratorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._02decoratorPattern.SkillOne
 * 用户: _VIEW
 * 时间: 2019/8/20,17:04
 * 描述: 一技能
 */
public class SkillOne extends Skill {
    private String skillName;

    public SkillOne(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        super.learnSkill();
        System.out.println("学会了一技能：" + skillName);
    }
}
