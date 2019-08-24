package com.wy.designPattern._builderpattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._builderpattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/24,22:59
 * 描述: 构建者模式测试类
 */
public class Main {
    public static void main(String[] args) {
        testPersonBuilder();
        testMealBuilder();
    }

    private static void testPersonBuilder() {
        Person person = new Person.Builder()
                .setHead("耳朵比较大")
                .setArmLeft("过左膝盖")
                .setArmRight("过右膝盖")
                .build();
        System.out.println(person);
    }

    private static void testMealBuilder() {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.PrepareVegMeal();
        vegMeal.showItems();
        Meal noVegMeal = builder.PrepareNoVegMeal();
        noVegMeal.showItems();
    }
}
