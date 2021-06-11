package com.huang.report02;
/*
 * 202006120115 黄健文
 * */
import java.util.Scanner;
public class reward {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩：");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            int score = scanner.nextInt();
            if (score >= 95 && score <= 100){
                System.out.println("恭喜你获得一辆自行车！");
            }else if (score >= 90){
                System.out.println("恭喜你获得游乐园一日游的机会！");
            }else if (score >= 80){
                System.out.println("恭喜你变成变形金刚！");
            }else if (score >= 0){
                System.out.println("恭喜你获得男女混合双打限定！");
            }else {
                System.out.println("你输入的成绩不合规范！");
            }
        }
    }
}
