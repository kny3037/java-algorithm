package com.likelion.java1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive1853 {
    public static int sum(int num){
        if(num==0)return num;
        return num + sum(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

    }
}
