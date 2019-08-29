package com.wy.designPattern._18CommandPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._18CommandPattern.Stock
 * 用户: _VIEW
 * 时间: 2019/8/29,22:09
 * 描述: 请求类
 */
public class Stock {
    private String name = "WuYou";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name : " + name + " Quantity: " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name : " + name + " Quantity: " + quantity + "] sold");
    }
}
