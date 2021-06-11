package com.huang.report09.jump;
/**
 * 202006120115 + 黄健文
 */
public class Dog extends Animal implements Ijumpping {
    int weight;

    public Dog(){}
    public Dog(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public void jumpping() {
        System.out.println(name + "在跳高。。。");
    }
    public void eat(){
        System.out.println(name + "在吃饭。。。");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
