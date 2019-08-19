package com.wy.designPattern._01strategyPattern;

import com.wy.designPattern._00factoryMethodPattern.Operator;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._01strategyPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/19,22:42
 * 描述: 策略模式测试类
 */
public class Main {
    public static void main(String[] args) {
        testContext();
        testContext2();
    }

    private static void testContext() {
        Context context = new Context(new AddOperation());
        System.out.println("Add: " + context.operate(10, 15));
        Context context1 = new Context(new SubOperation());
        System.out.println("Sub: " + context1.operate(10, 15));
        Context context2 = new Context(new MulOperation());
        System.out.println("Mul: " + context2.operate(10, 15));
        Context context3 = new Context(new DivOperation());
        System.out.println("Div: " + context3.operate(10, 15));
    }

    private static void testContext2() {
        Context2 context = new Context2(Operator.ADD);
        System.out.println("Add: " + context.operation(10, 15));
        Context2 context1 = new Context2(Operator.SUB);
        System.out.println("Sub: " + context1.operation(10, 15));
        Context2 context2 = new Context2(Operator.MUL);
        System.out.println("Mul: " + context2.operation(10, 15));
        Context2 context3 = new Context2(Operator.Div);
        System.out.println("Div: " + context3.operation(10, 15));
    }
}
