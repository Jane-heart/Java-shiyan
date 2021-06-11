package com.huang.report09.jump;
/**
 * 202006120115 + 黄健文
 */
import org.junit.Test;

public class TestAnimal {
    @Test
    public void TestCat(){
        Cat cat = new Cat("小猫", 12,99);
        System.out.println(cat.toString());
    }
    @Test
    public void TestDog(){
        Dog dog = new Dog("小狗", 1,79);
        System.out.println(dog.toString());
    }
}
