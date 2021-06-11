package com.huang.report04;
import java.util.Scanner;
public class StudentInfo {
    Student[] student;
    Scanner scanner;

    public StudentInfo() {
        student = new Student[20];
        scanner = new Scanner( System.in );
    }
    //方法：增删改查
    //增加
    public void input(){

        System.out.print("请输入人数：");
        int length = scanner.nextInt();
        for (int i = Student.n; i < Student.n + length; i++) {
            student[i] = new Student();
            student[i].stuNo = 2001001 + i;
            System.out.print("请输入学生姓名:");
            student[i].stuName = scanner.next();
            System.out.print("请输入学生所在学院:");
            student[i].college = scanner.next();
            System.out.print("请输入学生所在专业:");
            student[i].specialty = scanner.next();
            System.out.print("请输入学生性别:");
            student[i].stuSex = scanner.next();
            System.out.print("请输入学生手机号:");
            student[i].stuPhone = scanner.nextInt();
            System.out.print("请输入学生QQ号:");
            student[i].QQ = scanner.nextInt();
            System.out.print("请输入学生微信号:");
            student[i].weChat = scanner.nextInt();
        }
        Student.n += length;
        System.out.println("输入成功！！！");

        System.out.println("按下任意键继续...");
        scanner.hasNext();
    }
    //删除学号为xx的信息
    public void delete(int num){
        for (int i = 0; i < Student.n; i++) {
            if (student[i].stuNo == num ){
                System.out.printf("%-12d%-12s%-12s%-12s%-12s%-12d%-12d%-12d",student[i].stuNo,
                        student[i].stuName,student[i].college,student[i].specialty,student[i].stuSex,
                        student[i].stuPhone, student[i].QQ,student[i].weChat);
                System.out.println("");
                for (int j = i; j < Student.n-1; j++) {
                    student[j] = student[j+1];
                    student[j].stuNo--;
                }
                Student.n--;
                System.out.println("删除成功！！！");
            }
        }

        System.out.println("按下任意键继续...");
        scanner.hasNext();

    }
    //插入学号为xxx的信息
    public void insert(int num){
        for (int i = 0; i < Student.n; i++) {
            if (student[i].stuNo == num){
                //输入数据
                Scanner scanner = new Scanner(System.in);
                System.out.print("请输入学生姓名:");
                student[i].stuName = scanner.next();
                System.out.print("请输入学生所在学院:");
                student[i].college = scanner.next();
                System.out.print("请输入学生所在专业:");
                student[i].specialty = scanner.next();
                System.out.print("请输入学生性别:");
                student[i].stuSex = scanner.next();
                System.out.print("请输入学生手机号:");
                student[i].stuPhone = scanner.nextInt();
                System.out.print("请输入学生QQ号:");
                student[i].QQ = scanner.nextInt();
                System.out.print("请输入学生微信号:");
                student[i].weChat = scanner.nextInt();
                System.out.println("插入成功！！！");
                break;
            }
            else {
                System.out.println("不存在");
            }
        }

        System.out.println("按下任意键继续...");
        scanner.hasNext();
    }
    public void show(){
        System.out.println("学号\t\t\t姓名\t\t\t学院\t\t\t专业\t\t\t性别\t\t\t电话\t\t\tQQ号\t\t\t微信");
        for (int i = 0; i < Student.n; i++) {
            System.out.printf("%-12d%-12s%-12s%-12s%-12s%-12d%-12d%-12d\n",student[i].stuNo,
                    student[i].stuName,student[i].college,student[i].specialty,student[i].stuSex,
                    student[i].stuPhone, student[i].QQ,student[i].weChat);
        }

        System.out.println("按下任意键继续...");
        scanner.hasNext();
    }
}
class Student{
    //属性：学号，姓名，学院，专业，性别，手机号，qq号，微信号
    int stuNo;
    String stuName;
    String college;
    String specialty;
    String stuSex;
    int stuPhone;
    int QQ;
    int weChat;
    public static int n;
}
