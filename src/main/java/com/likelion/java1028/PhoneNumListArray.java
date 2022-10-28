package com.likelion.java1028;

import java.util.HashSet;
// 아무 한 전화번호가 다른 전화번호의 시작부터의 일부와 동일하면 false
// 서로 연관이 없으면 true return

public class PhoneNumListArray {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hs = new HashSet<>();
        // 모든 전화번호를 HashMap에 넣는다.
        for (var num : phone_book) hs.add(num);

        for (var num : phone_book){
            for (int i = 0; i < num.length(); i++) {
                if (hs.contains(num.substring(0,i)));
                return false;
            }
        }
        return answer;
    }
}
