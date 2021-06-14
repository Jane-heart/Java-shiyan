package com.huang.report11.code.test;

import com.huang.report11.code.User;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class IOStream {

    //上传图片到当前项目中（使用字节缓冲输入输出流）
    @Test
    public void loadingImage() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try{
            bis = new BufferedInputStream(new FileInputStream("src\\com\\huang\\report11\\resources\\flower.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("src\\com\\huang\\report11\\toResources\\flower.jpg",true));
            byte[] data = new byte[1024];
            int len;
            while ((len = bis.read(data)) != -1){
                bos.write(data,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            if (bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }

    //上传一个记事本文件到当前项目中（使用字符文件输入输出流）
    @Test
    public void loadingText(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(new FileReader("src/com/huang/report11/resources/优秀Java程序员写代码的风格.txt"));
            bw = new BufferedWriter(new FileWriter("src/com/huang/report11/toResources/代码风格.txt",true));
            char[] data = new char[1024];
            int len;
            while ((len = br.read(data)) != -1){
                bw.write(data);
            }
        }catch (Exception e){
            e.getStackTrace();
        }finally{
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //添加5个学生的姓名到name.txt文件中（使用集合的方式用字符缓冲输入输出流）
    @Test
    public void loadingName(){
        ArrayList<String> students = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            students = new ArrayList<>();
            br = new BufferedReader(new FileReader("src/com/huang/report11/resources/name.txt"));
            bw = new BufferedWriter(new FileWriter("src/com/huang/report11/toResources/name.txt"));
            String data = "";
            for (int i = 0; i < 5; i++) {
                data = br.readLine();
                if (data != null){
                    students.add(data);
                    data += "\n";
                    bw.write(data);
                }
            }
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //点名器：在第3个实验中生成一个name.txt文件，里面存储了班级同学的姓名，每个姓名占一行，要求通过程序实现随机点名器。
    @Test
    public void randomCallName(){
        ArrayList<String> students = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        Random random = null;
        try{
            students = new ArrayList<>();
            random = new Random();
            br = new BufferedReader(new FileReader("src/com/huang/report11/resources/name.txt"));
            bw = new BufferedWriter(new FileWriter("src/com/huang/report11/toResources/name.txt"));
            String data = "";
            while ((data = br.readLine()) != null ){
                students.add(data);
                data += "\n";
                bw.write(data);
            }
            int index = random.nextInt(students.size());
            System.out.println(students.get(index));
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //添加一个用户信息到文件（使用对象输出输入流）
    @Test
    public void addUser(){
        User user = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            user =  new User("小明","123456");
            ois = new ObjectInputStream( new FileInputStream("src/com/huang/report11/toResources/userObject.txt") );
            oos = new ObjectOutputStream(new FileOutputStream("src/com/huang/report11/toResources/userObject.txt"));
            oos.writeObject(user);
            User u = (User)ois.readObject();
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //添加多个用户信息到文件（采用集合并使用对象输出输入流）
    @Test
    public void addUsers(){
        User user = null;
        ArrayList users = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            users = new ArrayList<User>();
            oos = new ObjectOutputStream(new FileOutputStream("src/com/huang/report11/toResources/userList.txt"));
            ois = new ObjectInputStream( new FileInputStream( "src/com/huang/report11/toResources/userList.txt") );
            users.add( new User("小明","123456") );
            users.add( new User("小红","456789") );
            System.out.println(users);
            oos.writeObject(users);
            ArrayList<User> data = (ArrayList<User>) ois.readObject();
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
