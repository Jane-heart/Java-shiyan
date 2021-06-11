package com.huang.report08.domain;

public abstract class Animal {
    /*
    定义父类Animal为抽象类,
    成员变量：姓名name，年龄age
    构造方法：无参、全参
    成员方法：get/set方法、
    抽象方法：吃饭（）。
    */
    String name;
    Integer age;
    public Animal() {
    }
    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract void eatRice();
}
