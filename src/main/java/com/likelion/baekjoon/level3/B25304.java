package com.likelion.baekjoon.level3;

import java.util.Scanner;

public class B25304 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // 총 금액
        int N = sc.nextInt(); // 물건의 종류의 수
        int total = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            total+= a*b;
        }

        if (total == X){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
