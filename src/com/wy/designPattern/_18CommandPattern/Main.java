package com.wy.designPattern._18CommandPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._18CommandPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/29,22:18
 * 描述: 命令模式测试类
 */
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        BuyStock buyStock1 = new BuyStock(stock);
        BuyStock buyStock2 = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        SellStock sellStock1 = new SellStock(stock);
        Broker broker=new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(buyStock1);
        broker.takeOrder(buyStock2);
        broker.takeOrder(sellStock);
        broker.takeOrder(sellStock1);
        broker.placeOrders();
    }
}
