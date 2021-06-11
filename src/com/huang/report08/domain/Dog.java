package com.huang.report08.domain;

public class Dog extends Animal{
    /*
    定义狗类Dog，继承Animal类。
    成员属性：体重weight
    构造方法：无参、全参；
    成员方法：看门（）
    重写吃饭（）{…}
    */
    Integer weight;

    public Dog() {
    }
    public Dog(String name, Integer age, Integer weight) {
        super( name, age );
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void watchDoor(){
        System.out.println(name + "会看门了");
    }
    @Override
    public void eatRice() {
        System.out.println(name + "会吃饭了");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
