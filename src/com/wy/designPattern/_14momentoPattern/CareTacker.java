package com.wy.designPattern._14momentoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._14momentoPattern.CareTacker
 * 用户: _VIEW
 * 时间: 2019/8/27,15:22
 * 描述: 负责从Memento中恢复Originator的状态
 */
public class CareTacker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
