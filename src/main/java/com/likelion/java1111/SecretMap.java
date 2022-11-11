package com.likelion.java1111;

//
public class SecretMap {
    public void DecimalToBinary(int num){
        for (int i = num-1; i >= 0; i--) {
            int b = num >> i;
            if ((b&1)>0){
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }
    }
    public static void main(String[] args) {

        SecretMap sm = new SecretMap();
        sm.DecimalToBinary(3);


    }

}
