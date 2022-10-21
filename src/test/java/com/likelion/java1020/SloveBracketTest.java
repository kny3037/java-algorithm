package com.likelion.java1020;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SloveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는 지")
    void bracket(){
        SloveBracket sb = new SloveBracket();
        assertTrue(sb.solution("()()"));
        assertTrue(sb.solution("(())()"));
        assertFalse(sb.solution(")()("));
        //닫는 괄호로 시작하기 때문에 스택이 pop부터 시도.
        //하지만 스택이 비었기 때문에 pop을 할 수없어 EmptyStackException이 난다.
        assertFalse(sb.solution("(()("));
        assertFalse(sb.solution( "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));

    }

}