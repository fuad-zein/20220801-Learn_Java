package com.dicoding.javafundamental.array;

public class LoopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[1000000];

        // Inisiasi dan menampilkan arrInt dari element ke 1 sampai ke 1000000
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
