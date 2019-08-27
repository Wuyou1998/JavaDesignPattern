package com.wy.designPattern._15compositePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._15compositePattern.Company
 * 用户: _VIEW
 * 时间: 2019/8/27,15:49
 * 描述: 组合节点的抽象类
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    //添加子公司元素
    public abstract void add(Company company);

    //移除子公司元素
    public abstract void remove(Company company);

    //显示公司信息
    public abstract void display(int depth);

    //履行公司职责
    public abstract void lineOfDuty();

    protected String getDepth(int depth){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.append(">").append(": ").append(this.name).toString();
    }
}
