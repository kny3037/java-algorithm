package com.likelion.practice;

public class HashTable {

    private int size = 10000;
    private int[] table = new int[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash (String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum%size;
    }

    public void insert(String key, Integer value){
        int hashCode = hash(key);
        this.table[hash(key)] = value;
        System.out.println(key + " " + value + "번이 저장되었습니다.");
    }

    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]
                {"DongyeonKang", "SubinKang", "KwanwunKo"};

        HashTable ht = new HashTable(100);
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }
    }

}
