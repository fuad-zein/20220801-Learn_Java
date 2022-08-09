package Logic.Task01.Prima;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner nilai = new Scanner(System.in);

    System.out.print("Masukkan Nilai = ");
    int n, mod;
    n = nilai.nextInt();

    System.out.println();
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