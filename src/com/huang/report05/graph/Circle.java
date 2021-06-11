package com.huang.report05.graph;

public class Circle {
    double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return (Math.PI*this.radius*this.radius);
    }
    public double getPerimeter(){
        return (2*Math.PI*this.radius);
    }
}
