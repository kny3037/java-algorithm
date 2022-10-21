package com.likelion.java1020;

public class SloveBracket {
    public boolean solution(String s){

        while(s.indexOf("()") >= 0){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }
}
