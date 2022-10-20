package com.likelion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp(){
        // ex) db에서 데이터 지우는 코드
        // ex) db에 데이터를 넣는 코드
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
    }

    @Test
    void pushAndPop(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        //st.pop()이 비어있을 때 pop을 하면 어떻게 될까?
        assertThrows(EmptyStackException.class,()->{
            st.pop();
        });
        //ArrayIndexOutOfBoundsException이 난다.
        //그래서 test에서 Exception처리를 해준다!
    }

    @Test
    void isEmpty(){
        Stack02 st = new Stack02();
        st.push(10);
        boolean isEmpty = st.isEmpty();
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());

    }

    @Test
    void realStack(){
        Stack<Integer> st = new Stack<>();

    }

}