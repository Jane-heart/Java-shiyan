package com.huang.report05.graph;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){}
    public Rectangle(double length,double width){
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return (this.length*this.width);
    }
    public double getPerimeter(){
        return (this.length*this.width)*2;
    }
}
