package com.wy.designPattern._22interpreterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._22interpreterPattern.TerminalExpression
 * 用户: _VIEW
 * 时间: 2019/8/30,23:35
 * 描述: 实体类 1
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
