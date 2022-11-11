package com.likelion.java1111;

import java.util.Arrays;

//
public class SecretMap {
    public void DecimalToBinary(int num){
        for (int i = num-1; i >= 0; i--) {
            int b = num >> i;
            if ((b&1)>0){
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }
    }

    String getBinaryString(int decNum) {
        String answer = "";
        while(decNum > 0) {
            answer+= decNum % 2;
            decNum/= 2;
        }
        return answer;
    }


    String[] solution(int n, int[] arr1, int[] arr2) {
        var answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1","#").replace("0", " ");
            // 자릿수 맞춰주는 연산
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }
        return answer;
    }
    public static void main(String[] args) {

        SecretMap sm = new SecretMap();
        sm.DecimalToBinary(3);


    }

}
