package FundamentalJava.Materi;

public class MethodNonVoid {

  public static int penjumlahan(int a, int b) {
    return a + b;
  }

  public static float pembagian(float a, float b) {
    return a / b;
  }

  public static void main(String[] args) {
    /*
     * Method non-void = memiliki karakteristik yaitu memiliki nilai kembalian.
     * Keyword yang digunakan dalam pembuatannya yaitu tipe nilai kembalian.
     */

    // 1.1
    System.out.println(penjumlahan(5, 2));
    // 1.2
    int result = penjumlahan(5, 3);
    System.out.println(result);

    // 2.1
    System.out.println(pembagian(5, 2));
    // 2.2
    float result2 = pembagian(5, 3);
    System.out.println(result2);
  }
}
