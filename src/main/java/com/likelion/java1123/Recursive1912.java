package com.likelion.java1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive1912 {
    public static int factorial(int num){
        if(num == 1) return num;
        return num * factorial(num -1 );
    }

    public static void main(String[] args) throws IOException {
        System.out.println(factorial(5));
    }
}
