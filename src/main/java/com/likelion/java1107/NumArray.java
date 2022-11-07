package com.likelion.java1107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumArray {
    //1. 배열 길이 구하고
    //2. 나누어 떨어지는 값이 없으면 배열 값에 -1 반환
    //3. 구한 배열 길이만큼 배열 선언
    //4. 나누어 떨어지는 값 배열에 저장
    //5 정렬
    public int[] solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if (list.size() == 0) return new int[]{-1};

        //list를 Array로 바꾸고
        int[]answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        //sort 한 것을 리턴
        Arrays.sort(answer);
        return answer;
    }
}
