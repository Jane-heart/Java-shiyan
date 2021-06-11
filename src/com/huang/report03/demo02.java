package com.huang.report03;

public class demo02 {
    public static void main(String[] args) {
        int m = 0;
        char ch = 'A';
        switch(ch){
            case 9:
            case 'a':m = m + 1;break;
            case 'A':m = m + 1;
            case 66:m = m + 1;
            default:m = m + 3;
        }
        System.out.println(m);
    }
}
