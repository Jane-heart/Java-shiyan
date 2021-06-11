package com.huang.report04;

public class TestMobilePhone {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.setBrand("华为P40");
        phone.setPrice(9000);
        phone.setColor("red");
        System.out.println(phone.getBrand() + "的价格是" + phone.getPrice() + "元");
        phone.play("小明");
        phone.send("小红");
        phone.attribute();
    }
}

