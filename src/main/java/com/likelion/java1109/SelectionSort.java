package com.likelion.java1109;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int i = 0;
        //arr[0]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 0
        int minIdx = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[minIdx]>arr[j]){
                //minIdx의 값보다 arr[i]이 작으면 minIdx = arr[i]
                minIdx = j;
            }
        }
        int temp = arr[0];
        arr[0] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));


       i = 1;
        //arr[1]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 8
        minIdx = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[minIdx]>arr[j]){
                //minIdx의 값보다 arr[i]이 작으면 minIdx = arr[i]
                minIdx = j;
            }
        }
        temp = arr[1];
        arr[1] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

      i = 2;
        //arr[2]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기
        minIdx = 2;
        for (int j = 2; j < arr.length; j++) {
            if (arr[minIdx]>arr[j]){
                //minIdx의 값보다 arr[i]이 작으면 minIdx = arr[i]
                minIdx = j;
            }
        }
        temp = arr[2];
        arr[2] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));

      i = 3;
        //arr[3]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 8
        minIdx = 3;
        for (int j = 3; j < arr.length; j++) {
            if (arr[minIdx]>arr[j]){
                //minIdx의 값보다 arr[i]이 작으면 minIdx = arr[i]
                minIdx = j;
            }
        }
        temp = arr[3];
        arr[3] = arr[minIdx];
        arr[minIdx] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
