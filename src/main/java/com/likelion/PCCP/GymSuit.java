package com.likelion.PCCP;


// 전체 학생 수 2명 이상 30명 이하
// 체육복을 도난 당한 학생의 수는 1명 이상 n명 이하, 중복되는 번호 x
// 여벌의 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있다.
// 여벌 체육복을 가져온 학생이 체육복을 도난 당했을 수 있다.
// -> 이 때 이 학생은 체육복을 하나만 도난 당했다고 가정. 그럼 못 빌려줌.
// 여벌의 체육복이 있는 학생은 바로 앞번호나 바로 뒷번호 학생에게만 빌려줄 수 있다.
// 전체 학생 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
// 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve
// 체육 수업을 들을 수 있는 학생의 최댓값을 return.

// 여벌의 체육복이 있는 학생이 도난 당했을 경우 여벌의 체육복이 없는 학생으로 수정

public class GymSuit {
        public int solution(int n, int[] lost, int[] reserve) {

            //student 배열 생성
            int[] student = new int[n+2];
            int answer = 0;
            // lost, reserve 반영
            for (int l : lost) {
                student[l]--;
            }
            for (int r: reserve) {
                student[r]++;
            }
            //여분을 기준으로 앞 뒤에 체육복 빌려주기
            for (int i = 1; i <= n; i++) {
                if (student[i] == 1) { // 체육복이 있으면
                    if (student[i - 1] == -1) { // i의 앞 번호가 체육복이 없으면
                        student[i]--; //i는 빌려줘서 -해주고
                        student[i - 1]++; //i의 앞에 애는 생겼으니 +
                    } else if (student[i + 1] == -1) {// i의 뒷 번호가 체육복이 없으면
                        student[i]--; //i는 빌려줘서 -해주고
                        student[i + 1]++; //i의 뒤에 애는 생겼으니 +
                    }
                }
            }
            //체육복을 가지고 있는 애들 수 구하면
            for (int i = 1; i <= n; i++) {
                if (student[i] > -1){
                    answer++;
                }
            }
            return answer;
        }
    public static void main(String[] args) {
        GymSuit gs = new GymSuit();
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(gs.solution(5,lost,reserve));
    }
}
