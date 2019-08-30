package com.wy.designPattern._20mediatorPattern;

import java.util.Date;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._20mediatorPattern.ChatRoom
 * 用户: _VIEW
 * 时间: 2019/8/30,22:08
 * 描述: 聊天室 中介类
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]: " + message);
    }
}
