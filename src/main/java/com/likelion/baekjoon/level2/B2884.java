package com.likelion.baekjoon.level2;

import java.util.Scanner;

/*
* 45분 일찍 알람 설정하기
* 입력 시간은 24시간 표현을 사용
* 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
* 불필요한 0은 사용하지 않는다.
*
* 1. 45분 보다 작은 지 여부 확인
* 2. 시가 0보다 작은 지 여부 확인
* 3. 시가 0보다 작다면 시를 23으로 수정.
* 만약 입력 값이 45보다 작다면 (45 - 입력값)의 차이만큼 60에서 빼주기 -> 60-(45-입력값)
*/

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        if (M < 45){
            H--;
            M = 60-(45-M);
            if (H < 0){
                H = 23;
            }
            System.out.println(H + " " + M);
        }else {
            System.out.println(H + " " + (M-45));
        }


    }
}
