package com.likelion.java1122;

public class Print1To100V2 {
    public static void printTo100(int n){
        System.out.println(n);
        printTo100(n);
    }
    public static void main(String[] args) {
        printTo100(1);
    }
}
