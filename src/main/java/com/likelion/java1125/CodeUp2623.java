package com.likelion.java1125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//최대공약수 구하기
public class CodeUp2623 {
    public static int gcd(int a, int b){
        if(a > b) return gcd(a - b, b);
        else if (a < b) return gcd(a, b - a);
        else if (a == b) return a;
        return 1;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(gcd(169,42));

    }
}
