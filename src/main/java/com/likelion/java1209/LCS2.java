package com.likelion.java1209;

public class LCS2 {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; //열
        String str2 = "DCABDC";  // 행

        //str2인 DCABDC를 i로 놓고 바깥쪽에서 반복할 예정 //행
        //str1인 AVCDCBA를 j로 놓고 안쪽에서 반복할 예정  //열

        int[][] dp = new int[str2.length()][str1.length()];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                // 두 개가 같으면 대각선에서 가지고 온다.
                // 대각선 dp[i-1][j-1]
                if (i == 0 || j == 0){
                  dp[i][j] = 0;
                } else if (str1.charAt(j-1) == str2.charAt(i-1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    int up = dp[i-1][j];
                    int left = dp[i][j-1];
                    dp[i][j] = Math.max(up, left);
                }
            }
        }
        int k = dp[str2.length()][str1.length()];
        System.out.println(k);
    }
}
