package com.likelion.java1108;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n+1];

        for (int i = 1; i <= n; i++) {
            numbers[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int idx = -1;
        for (int i = 1; i <= n; i++) {
            if (k == numbers[i]){
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
