package com.huang.report04;
import java.util.Scanner;
public class TestStudentInfo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        Scanner scanner = new Scanner( System.in );
        int num = 0;
        int flag = 0;
        while (true){
            System.out.println("请输入你的选择：");
            System.out.println("输入数据请按1");
            System.out.println("展示数据请按2");
            System.out.println("插入数据请按3");
            System.out.println("删除数据请按4");
            System.out.println("退出请按0");
            flag = scanner.nextInt();
            if (flag == 1){
                studentInfo.input();
            }else if (flag == 2){
                studentInfo.show();
            }else if (flag == 3){
                System.out.println("请输入要插入学生的学号(如:2001001)：");
                num = scanner.nextInt();
                studentInfo.insert( num );
            }else if (flag == 4){
                System.out.println("请输入要删除学生的学号(如:2001001)：");
                num = scanner.nextInt();
                studentInfo.delete( num );
            }else if (flag == 0){
                System.out.println("已退出");
                break;
            }
        }
    }
}
