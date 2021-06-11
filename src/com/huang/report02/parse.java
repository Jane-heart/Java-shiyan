package com.huang.report02;
import java.util.Scanner;
/*
 * 202006120115 黄健文
 * */
public class parse {
    public static void main(String[] args) {
        String[] chineseNumbers = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String[] chineseUnits = {"", "万", "亿", "兆", "京", "垓", "秭", "穰", "沟", "涧", "正", "载", "极"};;
        String[] chineseUnits2 = {"", "拾", "佰", "仟"};
        String string = new String("");
        String insertString = new String("");
        System.out.print("请输入一个阿拉伯数字：");
        Scanner scanner = new Scanner( System.in );
        int str = scanner.nextInt();
        int count = (Integer.toString( str ).length()/4) + 1;

        for (int i = 1; i<= count; i++) {
            if (i != count){
                int split = str % 10000;
                str /= 10000;
                insertString = chineseUnits[i-1];
                for (int j = 0; j < 4; j++) {
                    int index = split%10;
                    split /= 10;
                    insertString = chineseNumbers[index] + chineseUnits2[j] + insertString;
                }
                string = insertString + string;
            }
            else{
                insertString = chineseUnits[i-1];
                int k = 0;
                while (str != 0){
                    int index = str % 10;
                    insertString =  chineseNumbers[index] + chineseUnits2[k] + insertString;
                    str /= 10;
                    k++;
                }
                string = insertString + string;
            }
        }
        System.out.println("转换结果为："+string);
    }
}
