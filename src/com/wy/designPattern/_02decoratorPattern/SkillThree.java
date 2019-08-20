package com.wy.designPattern._02decoratorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._02decoratorPattern.SkillThree
 * 用户: _VIEW
 * 时间: 2019/8/20,17:07
 * 描述: 三技能
 */
public class SkillThree extends Skill {
    private String skillName;

    public SkillThree(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        super.learnSkill();
        System.out.println("学会了三技能：" + skillName);
    }
}
