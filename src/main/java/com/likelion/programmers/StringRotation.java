package com.likelion.programmers;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int T = a.length();

        for(int i  = 0; i < T; i++){
            System.out.println(a.charAt(i));
        }
    }
}
