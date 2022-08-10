package Logic.Task01.Prima;

import java.util.Scanner;

public class LimitasiPrima01 extends Prima {
  int n, mod;
  Scanner nilai = new Scanner(System.in);

  @Override
  public void valuePrima() {
    System.out.print("Masukkan Nilai = ");
    n = nilai.nextInt();

    System.out.print("Bilangan Prima = ");

    for (int i = 1; i <= n; i++) {
      mod = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          mod = mod + 1;
        }
      }
      if (mod == 2) {
        System.out.print(i + " ");
      }
    }
  }
}

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
