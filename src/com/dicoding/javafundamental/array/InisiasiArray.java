package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println("Cara Pertama");
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);
        System.out.println();

        System.out.println("Cara Kedua");
        int[] arrInt2 = new int[6];
        arrInt2[0] = 7;
        arrInt2[1] = 8;
        arrInt2[2] = 9;
        arrInt2[3] = 10;
        arrInt2[4] = 11;
        arrInt2[5] = 12;

        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);

        int[] arrInt3 = {13, 14, 15, 16, 17, 18};

        System.out.println();
        System.out.println("Cara Ketiga");
        System.out.println(arrInt3[0]);
        System.out.println(arrInt3[1]);
        System.out.println(arrInt3[2]);
        System.out.println(arrInt3[3]);
        System.out.println(arrInt3[4]);
        System.out.println(arrInt3[5]);
    }
}
