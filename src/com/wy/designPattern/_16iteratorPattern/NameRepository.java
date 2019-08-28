package com.wy.designPattern._16iteratorPattern;


/**
 * 名称: JavaDesignPattern.com.wy.designPattern._16iteratorPattern.NameRepository
 * 用户: _VIEW
 * 时间: 2019/8/28,13:07
 * 描述: 需要迭代的类
 */
public class NameRepository implements Container {
    private String[] names = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if (hasNext())
                return names[index++];
            return null;
        }
    }
}
