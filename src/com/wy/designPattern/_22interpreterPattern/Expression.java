package com.wy.designPattern._22interpreterPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._22interpreterPattern.Expression
 * 用户: _VIEW
 * 时间: 2019/8/30,23:34
 * 描述: 表达式接口
 */
public interface Expression {
    boolean interpret(String context);
}
