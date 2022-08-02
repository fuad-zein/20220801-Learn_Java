package OOPJava.Percobaan.Coba02;

public class Drone {
  // atribut
  int energi;
  int ketinggian;
  int kecepatan;
  String merek;

  // method
  void terbang() {
    energi--;
    if (energi > 10) {
      // terbang berarti nilai ketinggian bertambang
      ketinggian++;
      System.out.println("Drone terbang...");
    } else {
      System.out.println("Energi lemah: Drone tidak bisa terbang");
    }
  }

  void matikanMesin() {
    if (ketinggian > 0) {
      System.out.println("Mesin tidak bisa dimatikan, karena sedang terbang");
    } else {
      System.out.println("Mesin dimatikan...");
    }
  }

  void turun() {
    // ketinggian berkurang, karena turun
    ketinggian--;
    energi--;
    System.out.println("Drone turun");
  }

  void belok() {
    energi--;
    System.out.println("Drone belok");
    // belok ke mana? perlu dicek :)
  }

  void maju() {
    energi--;
    System.out.println("Drone maju ke depan");
    kecepatan++;
  }

  void mundur() {
    energi--;
    System.out.println("Drone mundur");
    kecepatan++;
  }

}
