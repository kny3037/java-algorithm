package com.likelion.java1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive1851 {
    private static void printNum(int num){
        if(num==0)return;
        System.out.printf("%s","*");
        printNum(num-1);
    }
    private static String printNum2(int num){
        if(num==0)return "";
        return "*" + printNum2(num-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printNum(n);
        String r = printNum2(n);
        System.out.println(r);
    }

}
