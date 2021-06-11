package com.huang.report06.graph;

public class Rectangle {
    //属性: 长    宽
    private double length;
    private double width;
    public Rectangle(){}
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    //方法: 面积  周长
    double area(){
        return getLength()*getWidth();
    }
    double perimeter(){
        return (getWidth()+getLength())*2;
    }
}
