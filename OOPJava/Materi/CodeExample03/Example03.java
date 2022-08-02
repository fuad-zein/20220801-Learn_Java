package OOPJava.Materi.CodeExample03;

public class Example03 {

  /*
   * Polymorphism => Overloading & Overriding
   * - Overloading (contoh di class Person) :
   ** -> class sama,
   ** -> nama method sama,
   ** -> parameter beda,
   ** -> return value beda
   * 
   * - Overriding (contoh di kelas Employee) :
   ** -> nama method, parameter & return value sama
   */

  public static void main(String[] args) {
    Person dev = new Person("Dev", 22);

    dev.perkenalanDiri();
    System.out.println("=========================");
    // ================================================

    Employee jhon = new Employee(
        "14000",
        "Application Developer",
        500,
        "Jhon",
        25);

    // Call superclass method
    jhon.perkenalanDiri();
    System.out.println("==========================");
    // Call subclass method
    jhon.perkenalanDiri();
  }
}