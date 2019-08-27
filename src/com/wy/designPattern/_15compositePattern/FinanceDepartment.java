package com.wy.designPattern._15compositePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._15compositePattern.FinanceDepartment
 * 用户: _VIEW
 * 时间: 2019/8/27,16:10
 * 描述: 财务部
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(getDepth(depth));
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + "的职责是： 公司财务收支管理");
    }
}
