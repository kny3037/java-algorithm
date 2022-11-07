package com.likelion.java1107;

public class HarshadNumber {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;

        //자릿수 합
        while (num != 0){
            sum += num%10;
            num /= 10;
        }


        return true;
    }
}
