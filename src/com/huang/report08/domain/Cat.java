package com.huang.report08.domain;

public class Cat extends Animal{
    /*
    定义猫类Cat，继承Animal类。
    成员属性：可爱度lovely
    构造方法：无参、全参；
    成员方法：抓老鼠（）
    重写吃饭（）{…}
    */
    Integer lovely;

    public Cat() {
    }
    public Cat(String name, Integer age, Integer lovely) {
        super( name, age );
        this.lovely = lovely;
    }

    public Integer getLovely() {
        return lovely;
    }
    public void setLovely(Integer lovely) {
        this.lovely = lovely;
    }

    public void catchMouse(){
        System.out.println(name + "正在抓老鼠");
    }
    @Override
    public void eatRice() {
        System.out.println(name + "会吃饭了");
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lovely=" + lovely +
                '}';
    }
}
