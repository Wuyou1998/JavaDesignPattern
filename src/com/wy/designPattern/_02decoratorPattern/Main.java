package com.wy.designPattern._02decoratorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._02decoratorPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/20,17:10
 * 描述: 测试类
 */
public class Main {
    public static void main(String[] args) {
        YaoJin yaoJin = new YaoJin();
        SkillOne skillOne = new SkillOne(yaoJin, "爆裂双斧");
        SkillTwo skillTwo = new SkillTwo(skillOne, "激热回旋");
        SkillThree skillThree = new SkillThree(skillTwo, "正义潜能");
        skillThree.learnSkill();
    }
    /*运行结果：
     * 咬金学会了以下技能后大喊一声：好舒服啊！
     * 学会了一技能：爆裂双斧
     * 学会了二技能：激热回旋
     * 学会了三技能：正义潜能
     */
}
