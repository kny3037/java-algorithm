package com.likelion.java1019;

import java.util.ArrayList;
import java.util.List;

public class Stack01 {
    private int[] arr = new int [10000];
    // private List<Integer> arl = new ArrayList<>();
    // 리스트 연산을 안하려 하는 이유.
    // list에 push를 하면 array를 새로 만들어버린다.
    //= list.push()
    // new int[10001]로 만들어 버림.
    // 개수가 별로 없을 때는 괜찮지만 더 많아지면 속도 문제가 있다.
    private int pointer = 0;
    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value){
        //10 이 들어오면 arr[0]에 할당
        //20 이 들어오면 arr[1]에 할당
        this.arr[this.pointer] = value;
        this.pointer ++;
    }

    public int pop(){
        // push-> 10 push-> 20 pointer-> 2
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    }

    public int[] getArr(){
        return arr;
    }
}
