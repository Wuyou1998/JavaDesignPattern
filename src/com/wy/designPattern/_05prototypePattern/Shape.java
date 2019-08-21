package com.wy.designPattern._05prototypePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._05prototypePattern.Shape
 * 用户: _VIEW
 * 时间: 2019/8/21,22:09
 * 描述: 原型父类
 */
public abstract class Shape implements Cloneable {
    private String id;
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void draw();

    @Override
    protected Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
