package com.huang.report05.graph;

public class TestGrade {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("矩形的面积:" + rectangle.getArea());
        System.out.println("矩形的周长:" + rectangle.getPerimeter());
        System.out.println("圆的面积:" + circle.getArea());
        System.out.println("圆的周长:" + circle.getPerimeter());
    }
}
