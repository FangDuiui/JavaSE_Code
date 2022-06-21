package com.itFangDuidui_01;

public class Student {
    String name;
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + '，' + age);
    }
}
