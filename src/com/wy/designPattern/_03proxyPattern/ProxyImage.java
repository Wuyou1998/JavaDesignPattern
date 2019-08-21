package com.wy.designPattern._03proxyPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._proxyPattern.ProxyImage
 * 用户: _VIEW
 * 时间: 2019/8/20,19:27
 * 描述: 图片代理类
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null)
            realImage = new RealImage(fileName);
        realImage.display();
    }
}
