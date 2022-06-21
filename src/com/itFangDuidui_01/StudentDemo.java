package com.itFangDuidui_01;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "cnwcn";
//        s.age = 30;
        s.setAge(10);

        s.setAge(-30);

        s.show();
    }
}
