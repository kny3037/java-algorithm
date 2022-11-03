package com.likelion.java1103;

public class MultipleOf {

    public int solution(int n){
        int[] prime = new int[n + 1];
        int answer = 0;

        for (int i = 2; i < n; i++) {
            prime[i]=i;
        }


        return answer;
    }

    public static void main(String[] args) {

    }
}
