package Logic.Task01.Prima;

import java.util.Scanner;

public class LimitasiPrima02 extends Prima {
  int a1, a2;
  boolean isPrime = true;
  Scanner value = new Scanner(System.in);

  @Override
  public void valuePrima() {
    System.out.print("Masukkan Nilai Awal  = ");
    a1 = value.nextInt();
    System.out.print("Masukkan Nilai Akhir = ");
    a2 = value.nextInt();

    System.out.print("Bilangan Prima       = ");
    if (a1 == 0 || a1 == 1) {
      isPrime = false;
      System.out.println("nilai awal tidak boleh " + a1);
    } else {
      for (int i = a1; i < a2; i++) {
        isPrime = true;
        for (int j = 2; j <= (i / 2); j++) {
          if (i % j == 0) {
            isPrime = false;
            break;
          }
        }
        if (isPrime) {
          System.out.print(i + " ");
        }
      }
    }
  }
}

// Cara kedua = fix
// public class LimitasiPrima02 extends Prima {
// int cek, a1, a2;
// Scanner nilai = new Scanner(System.in);

// @Override
// public void valuePrima() {
// System.out.print("Masukkan Nilai Awal = ");
// a1 = nilai.nextInt();
// System.out.print("Masukkan Nilai Akhir = ");
// a2 = nilai.nextInt();

// System.out.print("Bilangan Prima = ");
// for (int i = a1; i <= a2; i++) {
// cek = 0;
// for (int j = 1; j <= i; j++) {
// if (i % j == 0) {
// cek = cek + 1;
// }
// }
// if (cek == 2) {
// System.out.print(i + " ");
// }
// }
// }
// }

// Cara ketiga = belum fix
// package Logic.Task01.Prima;

// import java.util.Scanner;

// public class LimitasiPrima02 extends Prima {
// int a1, a2;
// boolean isPrime;
// Scanner nilai = new Scanner(System.in);

// @Override
// public void valuePrima() {
// System.out.print("Masukkan Nilai Awal = ");
// a1 = nilai.nextInt();
// System.out.print("Masukkan Nilai Akhir = ");
// a2 = nilai.nextInt();

// System.out.print("Bilangan Prima = ");
// for (int i = a1; i < a2; i++) {
// isPrime = true;
// for (int j = 2; j <= (i / 2); j++) {
// if (i % j == 0) {
// isPrime = false;
// break;
// }
// }
// if (isPrime) {
// System.out.print(i + " ");
// }
// }
// }
// }
