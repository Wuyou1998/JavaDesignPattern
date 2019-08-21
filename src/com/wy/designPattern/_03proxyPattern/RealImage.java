package com.wy.designPattern._03proxyPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._proxyPattern.RealImage
 * 用户: _VIEW
 * 时间: 2019/8/20,19:25
 * 描述: 图片类
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("图片已从磁盘中加载出来了");
    }

    @Override
    public void display() {
        System.out.println("正在展示图片：" + fileName);
    }
}
