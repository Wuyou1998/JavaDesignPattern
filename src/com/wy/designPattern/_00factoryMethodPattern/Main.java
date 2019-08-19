package com.wy.designPattern._00factoryMethodPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._00factoryMethodPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/19,21:56
 * 描述: 简单工厂模式测试类
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Add: " + testOperation(10,15, Operator.ADD));
        System.out.println("Sub: " + testOperation(10,15, Operator.SUB));
        System.out.println("Mul: " + testOperation(10,15, Operator.MUL));
        System.out.println("Div: " + testOperation(10,15, Operator.Div));

    }

    private static double testOperation(double num1, double num2, Operator operator) {
        Operation operation = OperationFactory.getOperation(operator);
        operation.setNum_1(num1);
        operation.setNum_2(num2);
        return operation.operation();
    }
}
