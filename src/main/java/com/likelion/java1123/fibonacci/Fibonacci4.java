package com.likelion.java1123.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci4 {
    public int fib(int n){
        if (n==1|n==2) return 1;
        List<Integer> fibonacciNums = new ArrayList<>();

        int i = 0;
        fibonacciNums.add(1);
        i = 1;
        fibonacciNums.add(1);

        for (int j = 2; j < 7; j++) {
            fibonacciNums.add(fibonacciNums.get(j-1) + fibonacciNums.get(j-2));
        }
        return fibonacciNums.get(n-1);
    }

    public static void main(String[] args) {
        Fibonacci4 fibonacci4 = new Fibonacci4();
        System.out.println(fibonacci4.fib(2));
    }
}
