package com.huang.report06.graph;

public class TestGraph {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        Rectangle rectangle = new Rectangle();

        rectangle.setLength( 12 );
        rectangle.setWidth( 14 );
        cuboid.setLength( 12 );
        cuboid.setWidth( 14 );
        cuboid.setHeight( 13 );

        System.out.println("矩形的面积:" + rectangle.area());
        System.out.println("矩形的周长:" + rectangle.perimeter() );
        System.out.println("长方体的面积:" + cuboid.area());
        System.out.println("长方体的周长:" + cuboid.perimeter());
        System.out.println("长方体的体积:" + cuboid.volume());

    }
}
