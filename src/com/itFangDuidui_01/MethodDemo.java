package com.itFangDuidui_01;

public class MethodDemo {
    public static void main(String[] args) {
        int number = 10;
        isEvenNumber(number);
    }

    public static void isEvenNumber(int number) {
        if (number%2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
