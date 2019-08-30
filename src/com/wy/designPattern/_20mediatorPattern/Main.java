package com.wy.designPattern._20mediatorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._20mediatorPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/30,22:12
 * 描述: 中介者模式测试
 */
public class Main {
    public static void main(String[] args) {
        User user1=new User("girl");
        User user2=new User("boy");
        user1.sendMessage("约吗?");
        user2.sendMessage("对不起,我没钱.");
    }
}
