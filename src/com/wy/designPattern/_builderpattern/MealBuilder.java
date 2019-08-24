package com.wy.designPattern._builderpattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._builderpattern.MealBuilder
 * 用户: _VIEW
 * 时间: 2019/8/24,23:29
 * 描述: 点餐构造器，本类其实是兼具构造器和导演类双重功能
 */
public class MealBuilder {
    public Meal PrepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal PrepareNoVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
