package com.wy.designPattern._15compositePattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._15compositePattern.Main
 * 用户: _VIEW
 * 时间: 2019/8/27,16:12
 * 描述: 组合模式
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCompany concreteCompany1 = new ConcreteCompany("XXX总公司");
        concreteCompany1.add(new HRDepartment("总公司人力资源部"));
        concreteCompany1.add(new FinanceDepartment("总公司财务部"));
        ConcreteCompany concreteCompany2 = new ConcreteCompany("XXX上海分公司");
        concreteCompany1.add(concreteCompany2);
        concreteCompany2.add(new HRDepartment("上海分公司人力资源部"));
        concreteCompany2.add(new FinanceDepartment("上海分公司财务部"));
        concreteCompany1.display(1);
        concreteCompany1.lineOfDuty();
    }
}
