package com.likelion.java1031;

public class PrepareTest {
    /*
    1번 학생 : 1,2,3,4,5
    2번 학생 : 2,1,2,3,2,4,2,5
    3번 학생 : 3,3,1,1,2,2,4,4,5,5
     */
    public int[] solution(int[] answers) {

        int[] first = {1,2,3,4,5}; // 5개씩 반복
        int[] second = {2,1,2,3,2,4,2,5}; // 8개씩 반복
        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 10개씩 반복
        int[] score = {0,0,0}; // 각 수포자들의 점수

        int firstStudentAnswerCnt = 0;
        System.out.println(firstStudentAnswerCnt);

        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
