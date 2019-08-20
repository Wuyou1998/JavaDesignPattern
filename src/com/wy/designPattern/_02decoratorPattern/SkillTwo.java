package com.wy.designPattern._02decoratorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._02decoratorPattern.SkillTwo
 * 用户: _VIEW
 * 时间: 2019/8/20,17:07
 * 描述: 二技能
 */
public class SkillTwo extends Skill {
    private String skillName;
    public SkillTwo(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }
    @Override
    public void learnSkill() {
        super.learnSkill();
        System.out.println("学会了二技能：" + skillName);
    }
}
