package com.likelion.java1130;

import java.util.List;
import java.util.Scanner;

//한 수의 부모 노드를 찾고 싶으면 수를 2로 나누었을 때 나온 몫이 부모다.
public class CodeUp1936 {
    public static int goUp(int a, int b){
        if (a > b){
           return goUp(a / 2, b) + 1;
        } else if (a < b) {
            return goUp(a, b / 2) + 1;
        }else {
            //a == b
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(goUp(a,b));
    }
}
