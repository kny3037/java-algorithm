package com.likelion.baekjoon.level4;

import java.util.Scanner;

public class B10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;  //v와 일치할 때 개 수를 올리는 변수
        int N = sc.nextInt();
        int[]arr = new int[N];  // 배열 생성 후 길이는 N 만큼으로

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();  // 배열에 입력한 정수 넣어주기
        }

        int v = sc.nextInt();

        for (int j = 0; j < arr.length; j++) {  // 배열 길이만큼 반복하면서 변수 v 와 같은
            if (v == arr[j]){                  //숫자를 찾고, 만약 같으면 count 변수 ++
                count++;
            }
        }
        System.out.println(count);
    }
}
