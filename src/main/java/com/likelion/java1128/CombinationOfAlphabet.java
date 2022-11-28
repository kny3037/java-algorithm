package com.likelion.java1128;

public class CombinationOfAlphabet {

    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                System.out.println(i + "" + j);
            }
        }



    }
}
