package com.wy.designPattern._00factoryMethodPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._00factoryMethodPattern.OperationFactory
 * 用户: _VIEW
 * 时间: 2019/8/19,21:51
 * 描述: 静态工厂类
 */
public class OperationFactory {
    public static Operation getOperation(Operator operator) {
        Operation operation = null;
        switch (operator) {
            case ADD:
                operation = new OperationAdd();
                break;
            case SUB:
                operation = new OperationSub();
                break;
            case MUL:
                operation = new OperationMul();
                break;
            case Div:
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
