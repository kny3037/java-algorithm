package com.likelion.java1116;

import java.util.Arrays;

public class QuickSortArray {
    public int[] sort(int[]arr, int startIdx, int endIdx){
        int leftIdx = startIdx;
        int rightIdx = endIdx;
        int pivot = arr[(startIdx + endIdx) / 2];

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

        if(startIdx < rightIdx)sort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20,18,5,19,40,50,5,25};
        QuickSortArray qsa = new QuickSortArray();
        var r = qsa.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(r));
    }
}
