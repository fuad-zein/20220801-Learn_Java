package Logic.Task01.Prima;

// import java.util.List;
import java.util.Scanner;

public class SelfPrime {

  public static void getPrimes(int in) {
    boolean isPrime = true;
    int i = 2;
    while (i <= in) {
      int j = 2;
      while (j < i) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
        j++;
      }
      if (isPrime == true) {
        System.out.print(i + " ");
      }
      i++;
      isPrime = true;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println();
    System.out.println("===========================");
    System.out.println("       BILANGAN PRIMA      ");
    System.out.println("===========================");

    System.out.print("Masukkan Nilai = ");
    int in = input.nextInt();

    System.out.print("Bilangan Prima = ");
    getPrimes(in);

    // List<Integer> primes = getPrimes(in);
    // for (int i = 1; i < primes.size(); i++) {
    //   System.out.println("Bilangan Prima ke = "+ i + " dengan nilai = ");
    // }

    System.out.println();
    System.out.println("===========================");
  }
}
