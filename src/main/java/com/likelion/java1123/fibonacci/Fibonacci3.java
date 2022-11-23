package com.likelion.java1123.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci3 {
    public static void main(String[] args) {
        List<Integer> fibonacciNums = new ArrayList<>();

        int i = 0;
        fibonacciNums.add(1);
        i = 1;
        fibonacciNums.add(1);

        for (int j = 2; j < 7; j++) {
            fibonacciNums.add(fibonacciNums.get(j-1) + fibonacciNums.get(j-2));
        }
        System.out.println(fibonacciNums);
    }
}
