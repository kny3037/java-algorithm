package com.likelion.java1109;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int minIdx = 0;
        //arr[0]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 0
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                //min의 값보다 arr[i]이 작으면 min = arr[i]
                min = arr[i];
                minIdx=i;
            }
        }
        System.out.println(minIdx);

       // i = 1;
        //arr[1]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 8

      //  i = 2;

        //arr[2]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기

      //  i = 3;
        //arr[3]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 8
    }
}
