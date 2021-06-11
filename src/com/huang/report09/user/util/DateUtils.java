package com.huang.report09.user.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类：  构造方法私有、成员方法静态
 * （1） 定义日期工具类：DateUtils
 * （2）定义一个方法：dataToString()：功能是实现日期转换为指定的格式。
 *                                 返回值类型：String
 *                                 参数：Date   date,         String    format
 * （3）定义一个方法：stringToDate()：功能是实现字符串解析为指定格式的日期
 *  		     返回值类型：Date
 *                                 参数：String   str,  String    format
 */


public class DateUtils {
    /**
     * 功能是实现日期转换为指定的格式。
     * @param date   日期
     * @param format   格式的字符串
     * @return
     */
    public static String dateToString(Date date, String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }
    //字符串转换为日期型
    public static Date stringToDate(String str, String format) {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date date= null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }




}
