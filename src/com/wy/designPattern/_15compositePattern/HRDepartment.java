package com.wy.designPattern._15compositePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._15compositePattern.HRDepartment
 * 用户: _VIEW
 * 时间: 2019/8/27,16:05
 * 描述: 人力资源部
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
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
        System.out.println(this.name + "的职责是： 招聘员工进行培训");
    }
}
