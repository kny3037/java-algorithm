package com.likelion.programmers;

public class MaxAndMinValues {

    //*제한 조건
    //s에는 둘 이상의 정수가 공백으로 구분
    public String solution(String s) {

        String answer = "";

        // 입력 받은 문자열을 공백을 기준으로 잘라주기
        String[] str = s.split(" ");

       int max = Integer.MAX_VALUE;
       int min = Integer.MIN_VALUE;

        for (int i = 0; i < str.length; i++) {
            // 문자열 str을 int 형으로 반환
            int num = Integer.parseInt(str[i]);

            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }

        answer = min + " " + max;

        return answer;
    }

    public static void main(String[] args) {
        String number = "10 20";
        MaxAndMinValues maxmin = new MaxAndMinValues();

        System.out.println(maxmin.solution(number));
    }
}
