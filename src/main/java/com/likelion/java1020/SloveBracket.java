package com.likelion.java1020;

import java.util.Arrays;
import java.util.Stack;

public class SloveBracket {
    public boolean solution1(String s){
        //stack을 쓰지 않고 풀 수는 있지만 효율성에서 시간초과.
        while(s.indexOf("()") >= 0){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }

    public boolean solution2(String s){
        //stack을 쓰지 않고 풀 수는 있지만 효율성에서 시간초과.
        while (s.indexOf("()") >= 0){
            String[] splitted = s.split("\\(\\)");
            s = String.join("",splitted);
        }
        return s.length() == 0;
    }

    public boolean solution(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if('(' == s.charAt(i)){
                st.push(s.charAt(i));
            } else if (')' == s.charAt(i)) {
                if(st.empty()) return false;
                // 닫는 괄호부터 시작해서 비어있는 스택에 pop을 했을 때 처리
                st.pop();
            }
        }
        return st.empty();
    }
}
