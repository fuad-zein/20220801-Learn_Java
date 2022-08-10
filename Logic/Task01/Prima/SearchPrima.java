package Logic.Task01.Prima;

import java.util.Scanner;

public class SearchPrima extends Prima {
  int in;
  int cek = 0;
  Scanner input = new Scanner(System.in);

  @Override
  public void valuePrima() {
    System.out.print("Masukkan Nilai = ");
    in = input.nextInt();

    System.out.println();
    for (int i = 2; i <= in; i++) {
      if (in % i == 0) {
        cek++;
      }
    }
    if (cek == 1) {
      System.out.print(in + " adalah Bilangan Prima");
    } else {
      System.out.print(in + " bukan Bilangan Prima");
    }
  }
}
