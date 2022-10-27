package com.likelion.java1027;

import java.util.HashMap;

public class ARacerWhoArray {
    // completion의 길이는 participant의 길이보다 1 작습니다.라는 말은
    // participant 배열이 N이면 completion 배열은 N-1
    // participant 배열에는 있지만 completion 배열에 없는 1명을 찾으면 될 것 같다.
    // HashMap으로 participant 배열의 이름과 ?를  key와 value를 모두 입력해서
    // = HashMap.put(key, value) : HashMap에 key와 value를 한 쌍으로 입력하는 함수
    // completion에 동일하게 있는 사람을 1씩 빼면?
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            // 바로 put을 하지 않는다!
            // 바로 put을 할 수도 없고, 숫자는 올리긴 해야함,,!
            // 그래서 초기화를 해줘야 한다.
            if (!memo.containsKey(key)){
                memo.put(key,0); //0으로 초기화.
            }
            memo.put(key, memo.get(key)+1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];  //value 1
            memo.put(key, memo.get(key)-1);
        }
        for(String key : memo.keySet()){
            if(memo.get(key) == 1){
                return key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
