package com.likelion.java1102;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {
    public int solution(int n) {
        int answer = 0;

        //List만들기
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            list.add(i);
        }
        //2의 배수 지우기
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i)%2 == 0 && list.get(i) > 2){
              list.remove(i);
           }
        }
        System.out.println(list);
        System.out.println(list.size());

        //원소 출력해보기
        for(int data : list){
            System.out.println(data);
        }

        return answer;
    }


    public static void main(String[] args) {
        RemoveMultipleOf rmo = new RemoveMultipleOf();
        rmo.solution(50);
    }

}
