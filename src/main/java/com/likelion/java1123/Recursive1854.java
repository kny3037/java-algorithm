package com.likelion.java1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive1854 {
    public static int sumOfDigit(int q){
        if(q==0)return q;
        return q % 10 + sumOfDigit(q / 10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
    }
}
