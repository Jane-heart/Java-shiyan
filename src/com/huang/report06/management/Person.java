package com.huang.report06.management;

public class Person {
    //学号/工号 姓名  年龄  学院  专业
    private int no;
    private String name;
    private int age;
    private String college;
    private String major;

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    //自我介绍
    void introduce(){
        System.out.println("大家好，我叫" + name + ",我今年"+getAge()+"岁，来自"+getCollege()+getMajor());
    }
}
