package com.likelion.java1208;

public class FiboDp2 {
    public static long fib(int n, long[] memo){
        if (n == 0) throw new IllegalArgumentException("n은 1 이상이어야 합니다.");
        if (n <= 2) return 1;

        if (memo[n] == 0){
            memo[n] = fib(n-1, memo) + fib(n - 2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 5;
        var r = fib(n, new long[n+1]);
        System.out.println(r);
    }
}
