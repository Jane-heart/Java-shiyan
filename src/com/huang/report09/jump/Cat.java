package com.huang.report09.jump;
/**
 * 202006120115 + 黄健文
 */
public class Cat extends Animal implements Ijumpping {
    int lovely;

    public Cat(){}
    public Cat(String name, int age ,int lovely) {
        super(name,age);
        this.lovely = lovely;
    }


    @Override
    public void jumpping() {
        System.out.println(super.name + "在跳高。。。");
    }
    public void eat(){
        System.out.println(super.name + "在吃饭。。。");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "lovely=" + lovely +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
