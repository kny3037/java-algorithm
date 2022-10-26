package com.likelion.java1026;

import java.util.ArrayList;
import java.util.List;

public class HashTable { //10월 25일 코드에서 해시 충돌 해결
    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    private int size = 10000;
    private List<Node>[] table = new ArrayList[size];

    public int hash(String key){  // hash 함수 완료
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum%size;
    }

    public void insert(String key, int value){
        //List
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null){
            this.table[hashIdx] = new ArrayList<>();
        }
        //Map, Object
        this.table[hashIdx].add(new Node(key, value));
    }

    public Integer search(String key){
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())){
                return node.value;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert("Yoonseo",1);
        ht.insert("Seoyoon",2);

        int result = ht.search("Yoonseo");

        if(result == 1){
            System.out.println("테스트 성공");
        }else {
            System.out.printf("테스트 실패 value : %d",result);
        }
    }

 }


