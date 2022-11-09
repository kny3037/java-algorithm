package com.likelion.java1109;

import java.util.Arrays;

public class SelectionSort {
        public int[] SelSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
            return arr;
        }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.SelSort(arr)));
    }



}
