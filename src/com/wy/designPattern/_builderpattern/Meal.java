package com.wy.designPattern._builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._builderpattern.Meal
 * 用户: _VIEW
 * 时间: 2019/8/24,23:24
 * 描述: 一顿吃了啥
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name() + ", Packing: " + item.packing() + ", Price: " + getCost());
        }
    }
}
