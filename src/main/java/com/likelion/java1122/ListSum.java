package com.likelion.java1122;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static int sum(List<Integer>nums){
        if (nums.isEmpty()) return 0; //0을 리턴해준 이유는 덧셈이기 때문에
        return nums.remove(nums.size() -1) + sum(nums);
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        int r = sum(nums);
        System.out.println(r);

    }
}
