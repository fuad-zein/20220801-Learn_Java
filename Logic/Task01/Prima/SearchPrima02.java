package Logic.Task01.Prima;

import java.util.Scanner;

public class SearchPrima02 extends Prima {
  int in;
  int bagi = 0;
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
      for (int i = 2; i <= (in / 2); i++) {
        if (in % i == 0) {
          bagi = i;
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime) {
      System.out.print(in + " adalah Bilangan Prima");
    } else {
      System.out.print(in + " bukan Bilangan Prima karena bisa dibagi = " + bagi);
    }
  }
}
