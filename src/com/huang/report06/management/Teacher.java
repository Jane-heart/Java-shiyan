package com.huang.report06.management;

public class Teacher extends Person{
    //教研室
    private String department;

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    void teach(){
        System.out.println("我在教学...");
    }
}
