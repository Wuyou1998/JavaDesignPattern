package com.wy.designPattern._22interpreterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._22interpreterPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/30,23:42
 * 描述: 解释器模式 测试类
 */
public class Main {
    public static void main(String[] args) {
        Expression robert = getMaleExpression();
        Expression john = getMaleExpression();
        Expression julie = getMarriedWomanExpression();
        System.out.println("Robert 是个男人吗？：" + robert.interpret("Robert"));
        System.out.println("John 是个男人吗？：" + john.interpret("John"));
        System.out.println("julie 结婚了吗？：" + julie.interpret("Married Julie"));
    }

    //规则：Robert 和 John 是男性
    private static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    private static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
