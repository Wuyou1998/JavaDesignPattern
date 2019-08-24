package com.wy.designPattern._08builderPattern;

/**
 * 名称: JavaDesignPattern.com.wy.designPattern._08builderPattern.Person
 * 用户: _VIEW
 * 时间: 2019/8/24,22:45
 * 描述: 需要构建的类
 */
public class Person {
    private String head;
    private String armLeft;
    private String armRight;
    private String legLeft;
    private String legRight;

    private Person() {

    }

    public Person(String head, String armLeft, String armRight, String legLeft, String legRight) {
        this.head = head;
        this.armLeft = armLeft;
        this.armRight = armRight;
        this.legLeft = legLeft;
        this.legRight = legRight;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getArmLeft() {
        return armLeft;
    }

    public void setArmLeft(String armLeft) {
        this.armLeft = armLeft;
    }

    public String getArmRight() {
        return armRight;
    }

    public void setArmRight(String armRight) {
        this.armRight = armRight;
    }

    public String getLegLeft() {
        return legLeft;
    }

    public void setLegLeft(String legLeft) {
        this.legLeft = legLeft;
    }

    public String getLegRight() {
        return legRight;
    }

    public void setLegRight(String legRight) {
        this.legRight = legRight;
    }

    @Override
    public String toString() {
        return "这个人 头长得:" + head + " 左手长得:" +
                (getArmLeft() == null ? "默认值" : armLeft) +
                " 右手长得:" + (getArmRight() == null ? "默认值" : armRight) +
                " 左脚长得:" + (getLegLeft() == null ? "默认值" : legLeft) +
                " 右脚长得:" + (getLegRight() == null ? "默认值" : legRight);
    }

    static class Builder {
        private Person person;

        public Builder() {
            person = new Person();
        }

        public Builder setHead(String head) {
            person.setHead(head);
            return this;
        }

        public Builder setArmLeft(String armLeft) {
            person.setArmLeft(armLeft);
            return this;
        }

        public Builder setArmRight(String armRight) {
            person.setArmRight(armRight);
            return this;
        }

        public Builder setLegLeft(String legLeft) {
            person.setLegLeft(legLeft);
            return this;
        }

        public Builder setLegRight(String legRight) {
            person.setLegRight(legRight);
            return this;
        }

        public Person build() {
            if (person.head == null)
                throw new IllegalArgumentException("人应该有个头吧？");
            return person;
        }
    }
}
