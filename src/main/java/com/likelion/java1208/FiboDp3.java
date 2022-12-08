package com.likelion.java1208;

public class FiboDp3 {
    private int[] memo;

    public FiboDp3(int n){
        this.memo = new int [n + 1];
        this.memo[1] = 1;
        this.memo[2] = 2;
    }

    public int fib(int n) {
        if(n == 0) throw new IllegalArgumentException("n은 1 이상부터 가능합니다.");
        for (int i = 1; i <= n; i++) {
            if(this.memo[i] == 0){
                memo[i] = memo[i - 1] + memo[i - 2];
            }
        }
        return memo[n];
    }
    public static void main(String[] args) {
        FiboDp3 fiboDp3 = new FiboDp3(5);
        var r = fiboDp3.fib(5);
        System.out.println(r);
    }
}

