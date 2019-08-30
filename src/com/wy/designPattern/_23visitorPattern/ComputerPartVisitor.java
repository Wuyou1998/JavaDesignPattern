package com.wy.designPattern._23visitorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._23visitorPattern.ComputerPartVisitor
 * 用户: _VIEW
 * 时间: 2019/8/31,0:01
 * 描述: 访问者接口
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(KeyBoard keyBoard);

    void visit(Monitor monitor);
}
