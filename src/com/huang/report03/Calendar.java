package com.huang.report03;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * 202006120115 黄健文
 * */
public class Calendar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        System.out.println("请输入月份（1~12）：");
        int month = scanner.nextInt();
        LocalDate localDate = LocalDate.of( year, month, 1 );
        System.out.println("-----------------------------");
        System.out.println("**********" + year + "年" + month+ "月**********");
        System.out.println("=============================");
        System.out.println("  一   二  三   四  五   六  日");
        switch (localDate.getDayOfWeek()){
            case MONDAY:
                System.out.printf("%4d",localDate.getDayOfMonth());break;
            case TUESDAY:
                System.out.printf("%8d",localDate.getDayOfMonth());break;
            case WEDNESDAY:
                System.out.printf("%12d",localDate.getDayOfMonth());break;
            case THURSDAY:
                System.out.printf("%16d",localDate.getDayOfMonth());break;
            case FRIDAY:
                System.out.printf("%20d",localDate.getDayOfMonth());break;
            case SATURDAY:
                System.out.printf("%24d",localDate.getDayOfMonth());break;
            case SUNDAY:
                System.out.printf("%28d",localDate.getDayOfMonth());break;
        }
        for (int i = 1; i < localDate.lengthOfMonth(); i++) {
            System.out.printf("%4d",localDate.getDayOfMonth()+i);
            if (LocalDate.of( year,month, localDate.getDayOfMonth()+i ).getDayOfWeek()== DayOfWeek.SUNDAY){
                System.out.printf( "\n" );
            }
        }
    }
}
