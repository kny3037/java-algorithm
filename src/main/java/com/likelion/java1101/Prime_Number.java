package com.likelion.java1101;

public class Prime_Number {
//1번 방법 : 13이라는 수가 있다면 2~12까지 나누어 본다. remainder가 0이 아니면 소수(%사용)
    public boolean isPrime(int num){

        for (int i = 2; i < num; i++) {
            if ((num % i) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime_Number pn = new Prime_Number();
        System.out.println(pn.isPrime(13));
    }

}
