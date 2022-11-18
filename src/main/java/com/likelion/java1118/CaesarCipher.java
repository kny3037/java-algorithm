package com.likelion.java1118;
//AB를 1만큼 밀면 BC, 3만큼 밀면 DE
//z는 1만큼 밀면 a
//n 값으로는 1 ~ 25가 들어올 수 있다. = n이 너무 크면 알파벳 범위를 넘어버린다.
//대소문자 구분은 Character의 lowercase, uppercase를 써서 해보면?
//한 글자 씩 확인을 위해 charAt 사용

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                ch = (char)('a'+(ch-'a'+n)%26);
                //A/a와 원래 문자의 차이+밀리는 수 n을 더해주고 더한 값을 26으로 나눠주면
                //루프를 돌고나서의 차이(밀린 정도)가 나온다.
            } else if (Character.isUpperCase(ch)) {
                ch = (char)('A'+(ch-'A'+n)%26);
            }
            answer+=ch;
        }
        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        String result = cc.solution("AB",1);
        System.out.println(result);
    }

}
