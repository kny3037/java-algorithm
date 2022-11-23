package com.likelion.java1123.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci2 {
    public static void main(String[] args) {
        List<Integer> fibonacciNums = new ArrayList<>();

        int i = 0;
        fibonacciNums.add(1);
        i = 1;
        fibonacciNums.add(1);
        i = 2;
        fibonacciNums.add(fibonacciNums.get(1) + fibonacciNums.get(0)); // fibonacciNums.get(0) + fibonacciNums(1)
        i = 3;
        fibonacciNums.add(fibonacciNums.get(2) + fibonacciNums.get(1)); // fibonacciNums.get(0) + fibonacciNums(1)
        i = 4;
        fibonacciNums.add(fibonacciNums.get(3) + fibonacciNums.get(2)); // fibonacciNums.get(0) + fibonacciNums(1)


    }
}
