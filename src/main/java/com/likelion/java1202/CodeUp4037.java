package com.likelion.java1202;

import java.util.ArrayList;
import java.util.List;

public class CodeUp4037 {

    public static void main(String[] args) {

        List<Integer> primeNumbers = new ArrayList<>();
        int num = 72;
        int divNum = 2;
        while (true) {
            if (num <= 1) {
                break;
            }
            if (num % divNum == 0) {
                num /=divNum;
                System.out.print(divNum + " ");
            } else {
                divNum++;
            }
        }

        for (int primeNum : primeNumbers) {
            System.out.print(primeNum + ", ");
        }
    }
}