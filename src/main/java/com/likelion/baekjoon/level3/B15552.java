package com.likelion.baekjoon.level3;

import java.io.*;
import java.util.StringTokenizer;

public class B15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st; //테스트 케이스에서 주어지는 두 정수의 문자열 분리를 위해 사용

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()," ");
            // 매 반복마다 StringTokenizer 을 생성과 동시에 문자를 입력 받음.
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
            // 각 StringTokenizer 의 토큰 (분리되어있는 문자)을 반환
            // 반환되는 타입은 String이므로 Integer.parseInt를 통해 int형으로 바꾸어 준다.
            // 바꾼 두 토큰을 더해준 값을 BufferedWriter.write()에 넣어줌
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
