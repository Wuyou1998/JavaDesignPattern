package com.wy.designPattern._18CommandPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._18CommandPattern.BuyStock
 * 用户: _VIEW
 * 时间: 2019/8/29,22:12
 * 描述: 购买命令
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
