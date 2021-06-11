package com.huang.report07;

import org.junit.Test;

import java.util.Scanner;

public class TestRandom {
    public static void main(String[] args) {
        RandomDemo demo = new RandomDemo();
        System.out.println(demo.getRandom());
        System.out.println(demo.getRandom(10));
    }
    @Test
    public void test(){
        RandomDemo randomDemo = new RandomDemo();
        System.out.println( randomDemo.getRandom() );
        System.out.println( randomDemo.getRandom(8) );
    }
}
