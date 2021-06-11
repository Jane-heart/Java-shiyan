package com.huang.report03;
/*
* 202006120115 黄健文
* */
public class Sum {
    public static void main(String[] args) {
        //调用求和
        System.out.printf( "" + new Sum().requestSum() );
    }
    //求阶乘
    double requestProduct(int n){
        double product = 0;
        for (int i = 1; i <= n; i++) {
            product += i;
        }
        return product;
    }
    //求和
    double requestSum(){
        double sum = 0;
         for (int i = 1; i <= 20; i++) {
             sum += requestProduct(i);
         }
         return sum;
    }
}
