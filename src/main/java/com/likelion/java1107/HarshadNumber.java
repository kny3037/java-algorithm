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

        if(sum==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        HarshadNumber hn = new HarshadNumber();
        hn.solution(687);
    }
}
