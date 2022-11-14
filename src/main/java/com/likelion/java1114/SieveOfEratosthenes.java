package com.likelion.java1114;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int N = 50;
        int[]arr = new int[N-1];
        //System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;

        }

        //2를 제외한 2의 배수 0으로 만들기
        /*
          arr[4] = 0;
          arr[6] = 0;
          arr[8] = 0;
        */
        for (int i = 0; i * i<=N; i++) {
            System.out.println("i = "+ i);
            if (arr[i] != 0){
                for (int j = (i * 2 + 2); j < arr.length; j+=arr[i]) {
                    System.out.println(j);
                    arr[j]=0;
                }
            }
        }

        System.out.printf("%d %d\n", 2, arr[2]);
        System.out.printf("%d %d\n", 4, arr[4]);
        System.out.printf("%d %d\n", 5, arr[5]);
        System.out.printf("%d %d\n", 7, arr[7]);
        System.out.printf("%d %d\n", 47, arr[47]);
        System.out.printf("%d %d\n", 48, arr[48]);

    }

}
