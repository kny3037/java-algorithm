package com.likelion.java1110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateSameNumber {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        int value = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value){
                answerList.add(arr[i]);
                value=arr[i];
            }
        }

        answer = new int[answerList.size()]; //answer 리스트 크기 선언
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,3,0,1,1};
        HateSameNumber hs = new HateSameNumber();
        System.out.println(Arrays.toString(hs.solution(arr)));

    }
}
