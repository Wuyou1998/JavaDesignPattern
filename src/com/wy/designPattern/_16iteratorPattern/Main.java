package com.wy.designPattern._16iteratorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._16iteratorPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/28,13:12
 * 描述: 迭代器模式测试类
 */
public class Main {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }
    }
}
