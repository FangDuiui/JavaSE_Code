package com.itFangDuidui_01;
import java.util.Scanner;

public class WeightLossPlan_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数： ");
        int week = sc.nextInt();

        if (week<1 || week>7) {
            System.out.println("你输入的星期数有误！");
        } else if (week == 1) {
            System.out.println("caaw");
        } else if (week == 2) {
            System.out.println("cv");
        } else if (week == 3) {
            System.out.println("vnwivn");
        }
    }
}
