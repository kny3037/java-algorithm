package com.likelion.java1205;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            sum+=d[i];

            if (sum > budget){
                answer = i;
                System.out.println(answer);
                break;
            }
        }
        if (sum <= budget){
            answer = d.length;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[]arr={2,2,3,3,5};
        Budget bd = new Budget();
        System.out.println(bd.solution(arr, 10));
    }
}
