package com.wy.designPattern._18CommandPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._18CommandPattern.SellStock
 * 用户: _VIEW
 * 时间: 2019/8/29,22:14
 * 描述: 出售股票命令
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
