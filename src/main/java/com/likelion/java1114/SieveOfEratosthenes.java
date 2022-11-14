package com.likelion.java1114;

public class SieveOfEratosthenes {
    public int solution(int n){
        int answer = 0;
        int[] arr = new int[n+1];

        for (int i = 2; i<=n; i++){
            arr[i]=i;
        }

        for (int i = 0; i*i < n; i++) {
            if (arr[i]%2 == 0){
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {

    }

}
