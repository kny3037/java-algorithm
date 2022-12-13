package com.likelion.java1213;

class Pair{
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

public class OptimalStrategy {
    public static void main(String[] args) {
        int[] coins = {2,7,40,19};

        //4*4 배열
        Pair[][] dp = new Pair[coins.length][coins.length];

        //숫자가 써있는 동전이 1개만 있는 경우
        //2 or 7 or 40 or 19
        for (int i = 0; i < coins.length; i++) {
            //0,0,1,1,2,2,3,3
            //내가 왼쪽
            dp[i][i] = new Pair(coins[i], 0);
        }

        //숫자가 써있는 동전이 2개만 있는 경우
        for (int i = 0; i < coins.length-1; i++) {
            System.out.printf("%d %d %d %d\n", i, i+1, coins[i],coins[i+1]);
            int left = Math.max(coins[i], coins[i+1]);
            int right = Math.min(coins[i], coins[i+1]);
            dp[i][i+1] = new Pair(left,right);
            System.out.println(dp[i][i+1].toString());
        }

        /*for (int i = 0; i < coins.length; i++) {
            System.out.println(dp[i][i].toString());
        }*/
    }
}
