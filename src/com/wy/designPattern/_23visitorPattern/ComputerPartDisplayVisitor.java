package com.wy.designPattern._23visitorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._23visitorPattern.ComputerPartDisplayVisitor
 * 用户: _VIEW
 * 时间: 2019/8/31,0:12
 * 描述: 实现ComputerPartVisitor的实体类
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Display Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Display Mouse");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Display KeyBoard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display Monitor");
    }
}
