package com.likelion.java1206;

import java.util.Arrays;

public class HeapSort {
    public static int[] makeHeap(int[] arr, int parentIdx){
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greaterIdx = parentIdx;

        if(leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx] ){
            greaterIdx = leftIdx;
        }

        if(rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        if(parentIdx != greaterIdx) {
            int tmp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = tmp;
            makeHeap(arr, greaterIdx);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        arr = new int[]{5, 8, 4, 7, 3, 2, 9, 10, 11};

        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            arr = makeHeap(arr, i);
            System.out.println(Arrays.toString(arr));
        }
    }
}