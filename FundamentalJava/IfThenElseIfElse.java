package FundamentalJava;

public class IfThenElseIfElse {
  public static void main(String[] args) {
    // Jika suatu kondisi if tidak terpenuhi diberikan kondisi kedua / ketiga dst

    float ipk = 3.9f;

    if (ipk >= 3.9) {
      System.out.println("Mendapatkan beasiswa 100%");
    } else if (ipk >= 3.5) {
      System.out.println("Mendapatkan beasiswa 80%");
    } else {
      System.out.println("Tidak mendapatkan beasiswa");
    }
  }
}
