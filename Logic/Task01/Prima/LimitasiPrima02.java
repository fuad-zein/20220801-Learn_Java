package Logic.Task01.Prima;

import java.util.Scanner;

public class LimitasiPrima02 extends Prima {
  int mod, a1, a2;
  Scanner nilai = new Scanner(System.in);

  @Override
  public void valuePrima() {
    System.out.print("Masukkan Nilai Awal  = ");
    a1 = nilai.nextInt();
    System.out.print("Masukkan Nilai Akhir = ");
    a2 = nilai.nextInt();

    System.out.print("Bilangan Prima       = ");
    for (int i = a1; i <= a2; i++) {
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
