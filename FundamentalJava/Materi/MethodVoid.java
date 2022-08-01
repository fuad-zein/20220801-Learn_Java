package FundamentalJava.Materi;

public class MethodVoid {

  public static void perkenalanDiri() {
    System.out.println("Hai saya Fuad");
  }

  public static void perkenalanDiri2(String nama) {
    System.out.println("Hai saya : " + nama);
  }

  public static void main(String[] args) {
    /*
     * Method = merupakan sekelompok statement untuk melakukan suatu tujuan.
     * Method dapat digunakan berulang kali.
     * Method void = memiliki karakteristik yaitu tidak mengembalikan nilai.
     * Keyword yang digunakan dalam pembuatannya yaitu void.
     */

    perkenalanDiri();
    perkenalanDiri2("Fuad");
  }
}
