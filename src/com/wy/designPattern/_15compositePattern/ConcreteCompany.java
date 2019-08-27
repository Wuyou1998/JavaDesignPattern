package com.wy.designPattern._15compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._15compositePattern.ConcreteCompany
 * 用户: _VIEW
 * 时间: 2019/8/27,15:54
 * 描述: 总公司
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(java.lang.String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(getDepth(depth));
        for (Company company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children) {
            company.lineOfDuty();
        }
    }
}
