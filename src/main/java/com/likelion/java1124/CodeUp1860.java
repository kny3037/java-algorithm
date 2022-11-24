package com.likelion.java1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1860 {

    public static String getNums(int n){
        //n까지의 숫자를 만든다.
        if(n == 1) return "1";
        return getNums(n-1)+" " +n;
        // 더 작은 숫자가 먼저 나오게 처리
    }

    public static void printNums(int n){
        if (n == 0)return;
        printNums(n - 1);
        //먼저 작은 숫자를 호출해서 스택에 넣어줌
        System.out.println(getNums(n));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        printNums(n);

    }
}
