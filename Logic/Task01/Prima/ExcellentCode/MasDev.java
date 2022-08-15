package Logic.Task01.Prima.ExcellentCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MasDev {

  static List<Integer> getPrimes(int limit) {
    List<Integer> primes = new ArrayList<>();
    if (primes.size() == 0 & limit >= 2) {
      primes.add(2);
    }

    for (int i = 3; i <= limit; i++) {
      boolean isPrime = true;
      final int limit2 = i;
      for (Integer prime : primes.stream()
          .filter(x -> x <= limit2 / 2)
          .collect(Collectors.toList())) {
        if (i % prime == 0) {
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
    int limit = 100;
    List<Integer> primes = getPrimes(limit);
    System.out.println();

    for (int i = 0; i < primes.size(); i++) {
      System.out.println("Bilangan prima ke - " + (i + 1) + " adalah " +
          primes.get(i));
    }

    // System.out.println(primes.size());
  }
}
