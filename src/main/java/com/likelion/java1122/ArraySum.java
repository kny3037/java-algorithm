package com.likelion.java1122;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    public static int sum(int[] arr, int answer, int idx){
        if (arr.length == idx) return answer;
        return sum(arr,answer + arr[idx], idx + 1);
        //idx + 1을 해서 탈출 조건에 갈 수 있게 처리한다.
    }
    public static void main(String[] args) {
        int[] arr = new int []{7,3,2,9};
        int r = sum(arr,0, 0);
        System.out.println(r);

    }
}
