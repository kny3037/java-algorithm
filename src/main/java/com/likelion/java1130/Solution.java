package com.likelion.java1130;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ((n%i) == 0){
                System.out.println(answer += i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.solution(12);
    }
}
