package com.likelion.java1101;

public class TemplateCallback_Prime {
    //Template Callback적용

    boolean somOperation(int a, int b){
        return a < b;

    }

    public boolean isPrime(int num){
        for (int i = 2; somOperation(i, num); i++) {
            if ((num % i) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallback_Prime tcp = new TemplateCallback_Prime();
        boolean r = tcp.isPrime(17);
        System.out.println(r);
    }

}
