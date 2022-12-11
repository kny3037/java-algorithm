package com.likelion.PCCP;
// number.length()-k 자리 만큼을 구해야 함
// k 자리 수가 n이라 치면 뒤에서 n-1 만큼 빼고 앞에서 최댓값을 구한다.
// answer에 최대값 추가 하고 1개가 들어갔으니 n-1 로 최대값이 차지하고 남은 자리를 다시 n으로 기억.
// 그 후에 남은 자리를 n-1 로 그 다음 구하고 이걸 계속 하면 됨.
public class MakeBigNumbers {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;

        if (number.charAt(0)=='0') return "0";
        for (int i = 0; i < number.length()-k; i++) {
            char max = '0';

            for (int j = idx; j <= k + i; j++) {
                if (max < number.charAt(j)){
                    max = number.charAt(j);
                    idx = j+1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        MakeBigNumbers mb = new MakeBigNumbers();
        System.out.println(mb.solution("1924",2));
    }
}
