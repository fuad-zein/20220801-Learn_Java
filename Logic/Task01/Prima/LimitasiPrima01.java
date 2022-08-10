package Logic.Task01.Prima;

import java.util.Scanner;

public class LimitasiPrima01 extends Prima {
  boolean cek = true;
  int in;
  Scanner input = new Scanner(System.in);

  @Override
  public void valuePrima() {
    System.out.print("Masukkan Nilai = ");
    in = input.nextInt();

    System.out.print("Bilangan Prima = ");
    int i = 2;
    while (i <= in) {
      int j = 2;
      while (j < i) {
        if (i % j == 0) {
          cek = false;
          break;
        }
        j++;
      }
      if (cek == true) {
        System.out.print(i + " ");
      }
      i++;
      cek = true;
    }
  }
}

// public class LimitasiPrima01 extends Prima {
// int n;
// boolean cek;
// Scanner nilai = new Scanner(System.in);

// @Override
// public void valuePrima() {
// System.out.print("Masukkan Nilai = ");
// n = nilai.nextInt();

// System.out.print("Bilangan Prima = ");

// for (int i = 2; i < n; i++) {
// cek = true; // bilangan prima
// for (int j = 2; j <= (i / 2); j++) {
// if (i % j == 0) {
// cek = false;
// break;
// }
// }
// if (cek) {
// System.out.print(i + " ");
// }
// }
// }
// }

/*
 * Silahkan buat sebuah algoritma untuk mencetak bilangan prima dengan limitasi
 * 
 * Contoh 1
 * input : 10
 * Cetak : 2, 3, 5, 7
 * 
 * 
 * Contoh 2
 * input : 14
 * Cetak : 2, 3, 5, 7, 11, 13
 */

/*
 * 01. False
 * i = 4
 * 
 * j = 2; j <= 2
 * j = 2 -> 4%2==0 -> bukan bilangan prima
 * cek = false
 * 
 * 02. True
 * i = 7
 * 
 * j = 2;j <= 3 //bukan 3.5 karena int
 * j = 2 -> 7%2==1 -> cek = true
 * j = 3 -> 7%3==1 -> cek = true
 * cek = true; //bilangan prima
 */