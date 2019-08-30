package com.wy.designPattern._23visitorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._23visitorPattern.ComputerPart
 * 用户: _VIEW
 * 时间: 2019/8/31,0:03
 * 描述: 表示元素的接口
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
