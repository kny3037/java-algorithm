package com.likelion.java1116;

public class QuickSortArray {
    public static void main(String[] args) {
        var arr = new int[]{20,18,5,19,40,50,5,25};
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = 0;

        if (leftIdx >= rightIdx) return;

        while (arr[leftIdx] < pivot) leftIdx += 1;
        //leftIdx가 4가 되어 있을 것
        while (arr[rightIdx] > pivot) leftIdx -= 1;
        //leftIdx = 4, right = 7 그대로
        //왜? 25는 교환 대상이기 때문에
    }
}
