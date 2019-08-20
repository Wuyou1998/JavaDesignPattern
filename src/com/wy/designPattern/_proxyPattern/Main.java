package com.wy.designPattern._proxyPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._proxyPattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/20,19:29
 * 描述: 代理模式测试类
 */
public class Main {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("这是一张图片");
        proxyImage.display();
    }
}
