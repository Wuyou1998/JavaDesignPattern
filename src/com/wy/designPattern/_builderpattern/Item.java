package com.wy.designPattern._builderpattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._builderpattern.Item
 * 用户: _VIEW
 * 时间: 2019/8/24,23:10
 * 描述: 食物条目
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
