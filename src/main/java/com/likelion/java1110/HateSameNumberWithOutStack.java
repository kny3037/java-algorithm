package com.likelion.java1110;

import java.util.*;

public class HateSameNumberWithOutStack {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        //비교해서 스택에 넣기
        for (int i = 0; i < arr.length; i++) {
            if (st.peek() != arr[i]) st.push(arr[i]);
        }

        var answer = new int[st.size()];
        //거꾸로 꺼내기
        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,3,0,1,1};
        HateSameNumberWithOutStack hs = new HateSameNumberWithOutStack();
        System.out.println(Arrays.toString(hs.solution(arr)));

    }
}
