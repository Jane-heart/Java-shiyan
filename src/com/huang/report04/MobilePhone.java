package com.huang.report04;

public class MobilePhone {
    //属性：品牌，价格，颜色
    private String brand;
    private int price;
    private String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    //行为：打电话，发短信
    public void play(String name){
        System.out.println("正在使用" + getBrand() + "给" + name + "打电话...");
    }
    public void send(String name){
        System.out.println("正在使用" + getBrand() + "给" + name + "发短信...");
    }
    public void attribute(){
        System.out.println("Brand:" + getBrand());
        System.out.println("Price:" + getPrice());
        System.out.println("Color:" + getColor());
    }
}
