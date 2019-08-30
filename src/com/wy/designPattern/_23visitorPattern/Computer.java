package com.wy.designPattern._23visitorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._23visitorPattern.Computer
 * 用户: _VIEW
 * 时间: 2019/8/31,0:06
 * 描述: 实体类 电脑
 */
public class Computer implements ComputerPart {
    private ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{new Mouse(), new Monitor(), new KeyBoard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < computerParts.length; i++) {
            computerParts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
