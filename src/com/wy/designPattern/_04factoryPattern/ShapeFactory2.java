package com.wy.designPattern._04factoryPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._04factoryPattern.ShapeFactory2
 * 用户: _VIEW
 * 时间: 2019/8/21,21:39
 * 描述: 利用反射机制根据类名动态生成对象
 */
public class ShapeFactory2 {
    public static <T> T getShape(Class<? extends T> clazz) {
        if (clazz == null)
            throw new IllegalArgumentException("class对象不能为空！");
        T obj = null;

        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;

    }
}
