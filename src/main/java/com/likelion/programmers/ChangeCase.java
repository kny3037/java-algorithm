package com.likelion.programmers;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //값을 입력 받고
        String result = "";

        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            //String형 변수에서 글자 한 개씩 char형으로 바꿔서
            //대문자인지 소문자인지 판별

            if(Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            }else{
                result += Character.toLowerCase(c);
            }
            //변환 후 변수 result에 이어 붙여서 출력
        }
        System.out.println(result);
    }
}
