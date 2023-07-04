package com.likelion.baekjoon.level3;

import java.util.Scanner;

public class B2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", N, i, N*i);
        }
    }
}
