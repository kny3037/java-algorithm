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

        if(x%sum==0){ //sum==0으로 썼다가 오류나서 x%sum==0으로 수정
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
