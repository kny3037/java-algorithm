package com.likelion.java1102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultipleOf {
    public int solution(int n) {
        int answer = 0;

        boolean[] check = new boolean[n+1];
        Arrays.fill(check, true);

        for (int i = 2; i <= n; i++) {

        }

            return answer;
    }


    public static void main (String[]args){
        RemoveMultipleOf rmo = new RemoveMultipleOf();
        System.out.println(rmo.solution(100000));
    }


}