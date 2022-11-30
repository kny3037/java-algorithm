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

    public static void printAlphabet3(String prefix){
        if (prefix.length() > 3) return;
        System.out.println(prefix);

        for (char i = 'A'; i <= 'Z'; i++) {
            printAlphabet3(prefix+i);
        }
    }

    public static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void printAlphabet4(String prefix, int depth){
        if (prefix.length() > depth){
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < chars.length(); i++) {
            printAlphabet4(prefix + chars.charAt(i), depth);
        }
    }


        public static void main(String[] args) {
        printAlphabet('A');
        System.out.println();
        printTwoAlphabet('A',"AA");
        System.out.println();
        printAlphabet3(" ");
        System.out.println();
        printAlphabet4("",2);
        }
}
