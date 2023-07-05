package com.likelion.baekjoon.level3;

import java.util.Scanner;

public class B25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정수
        int div = N/4;
        sc.close();

        for (int i = 0; i < div; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
