package com.huang.report03;

public class demo01 {
    public static void main(String[] args) {
        int m = 123;
        int sum = 0, t = 100;
        while(t > 0){
            sum = sum + m%10*t;
            m = m/10;
            t = t/10;
        }
        System.out.printf("%d",sum);
    }
}
