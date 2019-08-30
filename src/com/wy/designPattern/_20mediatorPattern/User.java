package com.wy.designPattern._20mediatorPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._20mediatorPattern.User
 * 用户: _VIEW
 * 时间: 2019/8/30,22:09
 * 描述: 用户类
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
