package com.huang.report02;

import java.util.Scanner;

/*
 * 202006120115 黄健文
 * */
public class even {
    public static void main(String[] args) {
        int[] array = new int[20];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i]%2)==0){
                sum += array[i];
            }
        }
        System.out.println("sum=" + sum);
    }
}
