package com.likelion.java1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer>sort(List<Integer> arr){
        //1. 기준 값 뽑는 로직 구현
        int pivot = arr.get(arr.size()/2);  // 5
        System.out.println(pivot);
        //2. 기준 값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (pivot > arr.get(i)) left.add(arr.get(i));
            else if (pivot < arr.get(i)) right.add(arr.get(i));
        }
        System.out.println(left); //
        System.out.println(right); // 20, 18, 19, 25, 40, 50

        return sort(left) + pivot + sort(right);
    }

    public static void main(String[] args) {

        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};  //size : 8
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

    }
}
