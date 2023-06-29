package com.likelion.baekjoon.level2;

import java.util.Scanner;

public class B1330 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        if (A >= -10000 && B <= 10000){
            if (A > B) {
                System.out.println(">");
            } else if (A < B) {
                System.out.println("＜");
            } else {
                System.out.println("==");
            }
        }else {
            System.out.println("다시 입력해주세요.");
        }
    }
}
