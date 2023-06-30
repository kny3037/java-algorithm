package com.likelion.baekjoon.level2;

import java.util.Scanner;


/*
* 풀이 방법
 1. 시(A)와 분(B)을 하나의 분으로 변환을 한 뒤, 필요한 시간(C)를 더하고
    나온 결과 값을 다시 시와 분으로 변환하는 방법
 2. 필요한 시간(C)를 시와 분으로 변환을 한 뒤, 각 나누어진 시와 분을
    시(A)와 분(B)에 각각 더하여 연산하는 방법
*
*
*/
public class B2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = sc.nextInt();

        //입력 받은 시(A)와 분(B)을 하나의 분으로 변환
        int min = A * 60 + B;

        //요리하는 데 걸린 시간
        min += C ;

        //시 구하기 (1시간 = 60분, 걸린 시간/60 의 몫이 시간)
        int hour = (min / 60)%24; //-> 24시 이상이 될 경우 0시부터 시작

        //분 구하기(걸린 시간/60의 나머지가 분 -> 걸린 시간 % 60)
        int minute = min % 60;

        System.out.println(hour + " " + minute);

    }
}
