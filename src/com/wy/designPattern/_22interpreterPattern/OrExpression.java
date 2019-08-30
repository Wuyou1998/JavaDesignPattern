package com.wy.designPattern._22interpreterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._22interpreterPattern.OrExpression
 * 用户: _VIEW
 * 时间: 2019/8/30,23:37
 * 描述: 实体类 2
 */
public class OrExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
