package Logic.Task01.Prima.ExcellentCode;

import java.util.ArrayList;
import java.util.List;

public class SecPrime {
  public static List<Integer> getPrimes(int in) {
    List<Integer> primes = new ArrayList<>();

    for (int i = 2; i < in; i++) {
      boolean isPrime = true;
      for (int j = 2; j <= (i / 2); j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        primes.add(i);
      }
    }
    return primes;
  }

  public static void main(String[] args) {
    int in = 100;
    List<Integer> primes = getPrimes(in);
    System.out.println();

    for (int x = 0; x < primes.size(); x++) {
      System.out.println("Bilangan prima ke - " + (x + 1) + " adalah " + primes.get(x));
    }

    // System.out.println(primes.size());
  }
}
