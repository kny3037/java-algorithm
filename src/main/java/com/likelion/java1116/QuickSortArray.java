package com.likelion.java1116;

import com.likelion.java1115.QuickSort;

import java.util.Arrays;

public class QuickSortArray {
    public int[] sort(int []arr, int startIdx, int endIdx){
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        //--------------여기 아랫줄이 반복됨.----------------
        //언제까지 반복되는지? leftIdx == rightIdx일 때도 아래 로직이 반복됨
        //ex) leftIdx = 3, rightIdx = 3일 때도 반복

        //왼쪽과 오른쪽 각각 교환함
        //index를 정하는 부분 pivot까지 올 수도 있다.
        while(leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx += 1;
            //leftIdx가 4가 되어 있을 것
            while (arr[rightIdx] > pivot) rightIdx -= 1;
            //leftIdx = 4, right = 7 그대로
            //왜? 25는 교환 대상이기 때문에
            if (leftIdx <= rightIdx) {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
        }
        System.out.printf("leftIdx : %d, rightIdx : %d", leftIdx, rightIdx);
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20,18,5,19,40,50,5,25};
        QuickSort qs = new QuickSort();



    }
}
