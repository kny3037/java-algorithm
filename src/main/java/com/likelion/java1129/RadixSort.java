package com.likelion.java1129;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7,4,5,9,1,0};
        int[] radix = new int[10];
        Arrays.fill(radix,-1);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            radix[arr[i]] = arr[i];
        }

        System.out.println(Arrays.toString(radix));

        int cnt = 0;
        for (int i = 0; i < radix.length; i++) {
            if (radix[i] != -1){
                arr[cnt++] = radix[i];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
