package com.huang.report06.management;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        student.setNo(2020);
        student.setName("小明");
        student.setAge(18);
        student.setCollege( "信工" );
        student.setMajor( "软工" );
        student.setClassname( "3班" );

        teacher.setNo( 2016 );
        teacher.setName("张老师");
        teacher.setAge(22);
        teacher.setCollege( "信工" );
        teacher.setMajor( "软工" );
        teacher.setDepartment( "教研3组" );

        student.introduce();
        student.study();
        teacher.introduce();
        teacher.teach();

    }
}
