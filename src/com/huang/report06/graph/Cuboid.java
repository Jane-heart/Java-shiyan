package com.huang.report06.graph;

public class Cuboid extends Rectangle{
    public Cuboid(){}
    private double height;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    double area(){
        return 2*(getLength()*getWidth()+getLength()*getHeight()+getWidth()*getHeight());
    }
    double perimeter(){
        return (getHeight()+getWidth()+getLength())*4;
    }
    double volume(){
        return getHeight()*getLength()*getWidth();
    }
}
