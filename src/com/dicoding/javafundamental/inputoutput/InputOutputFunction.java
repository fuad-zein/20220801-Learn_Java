package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan Sangat Sederhana");
        System.out.print("Masukkan Angka Pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
