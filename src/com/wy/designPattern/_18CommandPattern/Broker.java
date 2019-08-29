package com.wy.designPattern._18CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._18CommandPattern.Broker
 * 用户: _VIEW
 * 时间: 2019/8/29,22:15
 * 描述: 命令调用类
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
