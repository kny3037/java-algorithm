package com.likelion.java1201;

import java.util.*;

public class HallOfFame2 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int minValue = score[0];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            //i까지의 최대

            if (list.size() < k){
                list.add(score[i]);
            }else{
                Collections.sort(list);
                if (list.get(0) < score[i]){
                    //최소값
                    list.remove(0);
                    //다시 넣고
                    list.add(score[i]);
                }
            }
            //다시 정렬
            Collections.sort(list);
            answer[i] = list.get(0);
        }

        return answer;
    }

    public static void main(String[] args) {
        HallOfFame2 hallOfFame2 = new HallOfFame2();
        var r = hallOfFame2.solution(3, new int[]{10,100,20,150,1,100,200});
        System.out.println(Arrays.toString(r));
    }
}
