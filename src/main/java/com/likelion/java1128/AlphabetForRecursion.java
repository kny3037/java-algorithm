package com.likelion.java1128;

public class AlphabetForRecursion {

    public static void printAlphabet(char a){
        if (a > 'Z') return;
        System.out.println(a);
        printAlphabet((char)(a + 1));
    }

    public static void printTwoAlphabet(char a, String prefix){
        if (a > 'Z') return;
        System.out.println(prefix+a);
        printTwoAlphabet((char)(a+1), prefix);
    }

    public static void main(String[] args) {
        printAlphabet('A');
        printTwoAlphabet('A',"AA");
    }
}
