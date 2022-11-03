package com.likelion.java1103;

import java.util.Arrays;

public class MultipleOf {

    public int solution(int n){
        //배열은 0부터이니 원하는 수까지 구하려면 n+1개의 배열을 만들어줘야 한다.
        int[] prime = new int[n + 1];
        int answer = 0;

        for (int i = 2; i < n; i++) {
            prime[i]=i;
        }


        return answer;
    }

    public static void main(String[] args) {
        int N = 50;
        int[] num = new int[N-1];  //N-1개 만큼 2~50까지. 총 49개
        boolean[] checks = new boolean[num.length];  // num만큼 hchecks생성
        Arrays.fill(checks, true); //check를 true로 초기화 -> 기본값 false
        for (int i = 0; i < num.length; i++) { // 2~50까지
            num[i] = i + 2;

        }
    }
}
