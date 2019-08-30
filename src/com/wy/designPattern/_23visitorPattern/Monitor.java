package com.wy.designPattern._23visitorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._23visitorPattern.Monitor
 * 用户: _VIEW
 * 时间: 2019/8/31,0:05
 * 描述: 实体类 主机
 */
public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
