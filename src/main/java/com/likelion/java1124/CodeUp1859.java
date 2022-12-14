package com.likelion.java1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1859 {

    public static void star(int n){
        if (n == 0) return;
        star(n-1);
        System.out.print(getStar(n));
        System.out.println("");
    }
    public static String getStar(int n){
        if (n == 0) return"";
        return "*" + getStar(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        star(n);
    }
}
