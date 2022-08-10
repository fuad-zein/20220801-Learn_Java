package Logic.Task01.Prima;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String in;

    Prima prima = new Prima();
    LimitasiPrima01 limitasiPrima01 = new LimitasiPrima01();
    LimitasiPrima02 limitasiPrima02 = new LimitasiPrima02();
    SearchPrima searchPrima = new SearchPrima();

    System.out.println();
    System.out.println("============================================");
    prima.valuePrima();

    System.out.println("============================================");
    System.out.println("A. Input Limitasi Bilangan Prima");
    System.out.println("B. Input Limitasi Bilangan Prima Awal Akhir");
    System.out.println("C. Menentukan Bilangan Prima atau Bukan");
    System.out.println("--------------------------------------------");

    System.out.print("Masukkan Pilihan = ");
    in = input.nextLine().toUpperCase();
    System.out.println("--------------------------------------------");

    System.out.println();
    switch (in) {
      case "A":
        System.out.println("   A. Input Limitasi Bilangan Prima   ");
        System.out.println();
        limitasiPrima01.valuePrima();
        System.out.println();
        System.out.println("============================================");
        System.out.println();
        break;

      case "B":
        System.out.println("B. Input Limitasi Bilangan Prima Awal Akhir");
        System.out.println();
        limitasiPrima02.valuePrima();
        System.out.println();
        System.out.println("============================================");
        System.out.println();
        break;

      case "C":
        System.out.println("  C. Menentukan Bilangan Prima atau Bukan   ");
        System.out.println();
        searchPrima.valuePrima();
        System.out.println();
        System.out.println("============================================");
        System.out.println();
        break;

      default:
        System.out.println("Maaf, input salah!!!");
        break;
    }
  }
}