package FundamentalJava.Materi;

public class WhileDoWhile {
  public static void main(String[] args) {
    // Digunakan untuk mengeksekusi code program yang memiliki pola secara berulang.

    // 1. while-do
    int counter = 1;
    while (counter < 10) {
      System.out.println("Counter : " + counter);
      counter++;
    }

    System.out.println("");

    // 2. do-while
    counter = 12;
    do {
      System.out.println("Counter : " + counter);
      counter++;
    } while (counter < 10);

    /*
     * Perbedaan mendasar antara while dan do while = proses pengecekan kondisinya
     * While = dilakukan di awal
     * Do-While = dilakukan di akhir
     */
  }
}
