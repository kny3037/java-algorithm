package com.likelion.PCCP;

import java.util.Arrays;

public class RemoveSmallestNumber {
// 배열 arr에서 가장 작은 수를 제거한 배열을 리턴
// 빈 배열이면 -1 리턴
// 배열에서 가장 작은 수를 찾아내고

    public int[] solution(int[] arr) {
        int n = arr.length;

        if (arr.length < 2){
            return new int[]{-1};
        }

        int [] answer = new int[n-1];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min){
                continue;
            }
            answer[index++] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveSmallestNumber rs = new RemoveSmallestNumber();
        int[]arr = {4,3,2,1};
        int[]arr2 = {10};

        int a[] = rs.solution(arr);
        int b[] = rs.solution(arr2);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    }


