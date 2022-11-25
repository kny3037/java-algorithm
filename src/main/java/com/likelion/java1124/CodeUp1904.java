package com.likelion.java1124;

public class CodeUp1904 {
    public static void printNums(int a, int b){
        if (a >= b) return;
        printNums(a + 1, b);
        if (a % 2 != 0){
            System.out.printf("%d", a);
        }
    }

    public static void main(String[] args) {
        printNums(2,7);
    }
}
