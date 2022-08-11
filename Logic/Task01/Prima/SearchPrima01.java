package Logic.Task01.Prima;

import java.util.Scanner;

// Cara pertama = fix
public class SearchPrima01 extends Prima {
  int in;
  boolean isPrime = true;
  Scanner input = new Scanner(System.in);

  @Override
  public void valuePrima() {
    System.out.print("Masukkan Nilai = ");
    in = input.nextInt();

    System.out.println();
    if (in == 0 || in == 1) {
      isPrime = false;
    } else {
      for (int i = 2; i < (in / 2); i++) {
        if (in % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime) {
      System.out.print(in + " adalah Bilangan Prima");
    } else {
      System.out.print(in + " bukan Bilangan Prima");
    }
  }
}

// Cara kedua = fix
// public class SearchPrima01 extends Prima {
// int in;
// int isPrime = 0;
// Scanner input = new Scanner(System.in);

// @Override
// public void valuePrima() {
// System.out.print("Masukkan Nilai = ");
// in = input.nextInt();

// System.out.println();
// for (int i = 2; i <= in; i++) {
// if (in % i == 0) {
// isPrime++;
// }
// }
// if (isPrime == 1) {
// System.out.print(in + " adalah Bilangan Prima");
// } else {
// System.out.print(in + " bukan Bilangan Prima");
// }
// }
// }
