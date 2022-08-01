package FundamentalJava.Materi;

public class AritmaticsOperator3 {
  public static void main(String[] args) {
    /*
     * Lanjutan dari Operator Assignment:
     * - Post Increment
     * - Pre Increment
     * - Post Decrement
     * - Pre Decrement
     */

    int angka3 = 5;
    System.out.println("Hasil dari Post Increment : " + angka3++); // Cetak 5
    angka3 = 5;
    System.out.println("Hasil dari Pre Increment : " + ++angka3); // Cetak 6
    angka3 = 5;
    System.out.println("Hasil dari Post Decrement : " + angka3--); // Cetak 5
    angka3 = 5;
    System.out.println("Hasil dari Pre Decrement : " + --angka3); // Cetak 4
  }
}
