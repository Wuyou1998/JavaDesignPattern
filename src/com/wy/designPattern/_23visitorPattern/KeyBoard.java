package com.wy.designPattern._23visitorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._23visitorPattern.KeyBoard
 * 用户: _VIEW
 * 时间: 2019/8/31,0:04
 * 描述: 实体类 键盘
 */
public class KeyBoard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
