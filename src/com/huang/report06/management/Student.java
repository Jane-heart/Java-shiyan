package com.huang.report06.management;

public class Student extends Person{
    //班级
    private String classname;

    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }

    //学习
    void study(){
        System.out.println("我正在学习...");
    }
}
