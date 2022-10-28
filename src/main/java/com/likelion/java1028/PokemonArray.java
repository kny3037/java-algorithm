package com.likelion.java1028;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PokemonArray {
    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        //중복되지 않는다면 add를 한다.
        for (int i = 0; i < nums.length; i++) {
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        if (arr.size() > nums.length/2){
            answer = nums.length/2;
        }else {
            answer = arr.size();
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
