package com.likelion.java1109;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

interface  StatementStrategy{ // 인터페이스로 내림차순 적용
    boolean apply(int a, int b);
}
public class SelectionSort {
        public int[] SelSort(int[] arr, StatementStrategy stmt) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (stmt.apply(arr[j], arr[minIdx])) {
                        minIdx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
            return arr;
        }

        public int[] SelSort2(int[] arr, BiFunction<Integer, Integer, Boolean> biFunction) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (biFunction.apply(arr[j], arr[minIdx])) {
                        minIdx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
            return arr;
        }

    public int[] SelSortDesc(int[] arr) {  // 복사해서 > 만 변경해서 내림차순 적용
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.SelSort(arr, (a,b) -> a < b);
        selectionSort.SelSort(arr, (a,b) -> a > b);

        Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        System.out.println(fn.apply(new Integer[]{10, 20}));

        System.out.println(Arrays.toString(selectionSort.SelSortDesc(arr)));

        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;

    }



}
