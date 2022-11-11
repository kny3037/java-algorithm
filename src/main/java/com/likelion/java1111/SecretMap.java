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


    String solution(int n, int[] arr1, int[] arr2) {
        String answer = "";
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];
        for (int i = 0; i < n; i++) {
            // arr1
            for (int j = 0; j < n; j++) {
                String binStr1 = getBinaryString(arr1[i]);
                String binStr2 = getBinaryString(arr2[i]);
                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
                sArr2[i] = "0".repeat(n - binStr2.length()) + getBinaryString(arr2[i]);
            }
        }
        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));

        return answer;
    }
    public static void main(String[] args) {

        SecretMap sm = new SecretMap();
        sm.DecimalToBinary(3);


    }

}
