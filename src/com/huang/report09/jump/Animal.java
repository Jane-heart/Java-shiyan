package com.huang.report09.jump;
/**
 * 202006120115 + 黄健文
 */
public abstract class Animal {
    String name = "Animal";
    int age=18;

    public Animal(){}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
}
