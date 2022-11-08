package com.likelion.java1108;

public class BinarySearch {
    public static void main(String[] args) {
        int targetNum = 7;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int start = 0;
        int end = nums.length;

        //중간 값 찾기
        int startIdx = 0;
        int endIdx = nums.length - 1;
        while (true) {
            int midIdx = endIdx / 2;
            int midValue = nums[midIdx];

            //인덱스 시작점, 끝점 옮기기
            if (midValue > targetNum) {  //7이 6보다 큰가? 작은 것은 모두 버린다.
                startIdx = midIdx + 1;
            } else if (midValue < targetNum) { //7이 6보다 작습니까? 6 이상을 모두 버린다.
                endIdx = midIdx - 1;
            } else {
                //같은 지 비교
                // 두 수가 같은 경우 = 답
                System.out.println(midIdx);
            }
        }
    }
}
