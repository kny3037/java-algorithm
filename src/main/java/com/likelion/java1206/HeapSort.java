package com.likelion.java1206;

import java.util.Arrays;

public class HeapSort {
    public static int[] makeHeap(int[] arr, int parentIdx, int arrsize){
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greaterIdx = parentIdx;

        if(leftIdx < arrsize && arr[leftIdx] > arr[greaterIdx] ){
            greaterIdx = leftIdx;
        }

        if(rightIdx < arrsize && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        if(parentIdx != greaterIdx) {
            int tmp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = tmp;
            makeHeap(arr, greaterIdx, arrsize);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        arr = new int[]{10,9,5,8,3,2,4,6,7,1};

        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            arr = makeHeap(arr, i, arr.length);
            System.out.println(Arrays.toString(arr));
        }

        for (int i = arr.length-1; i > 0; i--) {
            int temp = arr[0];
            arr[0]= arr[i];
            arr[i] = temp;
            arr = makeHeap(arr, 0,i);
            System.out.println(Arrays.toString(arr));
        }
    }
}