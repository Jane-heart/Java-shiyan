package com.huang.report02;
/*
 * 202006120115 黄健文
 * */
public class demo03 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{5,6},{7,8,9}};
        a[2] = a[0];
        System.out.println(a[2][0]);
    }
}
