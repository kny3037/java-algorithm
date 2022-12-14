package com.likelion.java1214;

import java.util.Arrays;

public class SumUntil {
    public static void main(String[] args) {
        int[] coins = {2,7,40,19};
        int[][] dp = new int[coins.length][coins.length];

        int i = 0;

        for (int j = 0; j < coins.length; j++) {
            if (j == 0){
                dp[i][j] = coins[0];
            }else {

                dp[i][j] = dp[i][j-1] + coins[i];  //핵심 로직
            }
            System.out.println(Arrays.toString(dp[i]));
        }

        // 아래의 코드는 위의 for문 루프로 처리.
       /* dp[i][0] = coins[0];
        dp[i][1] = dp[i][0] + coins[1]; //dp[i][0]에는 0까지 더한 값이 들어있다.
        dp[i][2] = dp[i][2] + coins[2]; //dp[i][1]에는 1까지 더한 값이 들어있다.
        dp[i][3] = dp[i][3] + coins[3]; //dp[i][2]에는 2까지 더한 값이 들어있다.*/



    }
}
