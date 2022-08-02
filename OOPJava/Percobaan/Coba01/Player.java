package OOPJava.Percobaan.Coba01;

public class Player {
  // definisi atribut
  String name;
  int speed;
  int healtPoint;

  // definisi method run
  void run() {
    System.out.println(name + " is running...");
    System.out.println("Speed: " + speed);
  }

  // definisi method isDead untuk mengecek nilai kesehatan (healtPoint)
  boolean isDead() {
    if (healtPoint <= 0) {
      return true;
    }
    return false;
  }
}
