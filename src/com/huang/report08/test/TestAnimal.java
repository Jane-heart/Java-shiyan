package com.huang.report08.test;

import com.huang.report08.domain.Dog;
import com.huang.report08.domain.Cat;
import org.junit.Test;

public class TestAnimal {
    /*
    定义测试类，并添加一个测试方法，分别实例化猫和狗的对象，并输出结果。
    */
    @Test
    public void test(){
        Cat cat = new Cat( "花花", 1, 99 );
        Dog dog = new Dog( "大壮", 5, 60 );
        System.out.println( cat.toString() );
        cat.eatRice();
        cat.catchMouse();
        System.out.println( dog.toString() );
        dog.eatRice();
        dog.watchDoor();
    }
}
