package com.wy.designPattern._01strategyPattern;

import com.wy.designPattern._00factoryMethodPattern.Operator;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._01strategyPattern.Context2
 * 用户: _VIEW
 * 时间: 2019/8/19,22:47
 * 描述: 策略模式和工厂模式结合,这样就不用把判断交给客户端去完成
 */
public class Context2 {
    private Operation operation;

    public Context2(Operator operator) {
        switch (operator) {
            case ADD:
                operation = new AddOperation();
                break;
            case SUB:
                operation = new SubOperation();
                break;
            case MUL:
                operation = new MulOperation();
                break;
            case Div:
                operation = new DivOperation();
                break;
        }
    }

    public double operation(double num1, double num2) {
        return operation.operation(num1, num2);
    }
}
