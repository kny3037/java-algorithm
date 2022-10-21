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
        assertFalse(sb.solution("(()("));
        assertFalse(sb.solution( "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));

    }

}