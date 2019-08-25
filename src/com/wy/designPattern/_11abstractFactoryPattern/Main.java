package com.wy.designPattern._11abstractFactoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._11abstractFactoryPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/25,22:50
 * 描述: 抽象工厂测试类
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        AbstractFactory gameFactory = FactoryProducer.getFactory("GAME");
        Color red = colorFactory.getColor("红色");
        red.draw();
        Color blue = colorFactory.getColor("蓝色");
        blue.draw();
        Color yellow = colorFactory.getColor("黄色");
        yellow.draw();
        Game game1 = gameFactory.getGame("王者荣耀");
        game1.play();
        Game game2 = gameFactory.getGame("游戏1");
        game2.play();
        Game game3 = gameFactory.getGame("游戏2");
        game3.play();
    }
}
