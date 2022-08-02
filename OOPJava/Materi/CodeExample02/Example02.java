package OOPJava.Materi.CodeExample02;

public class Example02 {
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
    jhon.perkenalanDiriEmployee();
  }
}