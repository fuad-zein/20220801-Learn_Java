package OOPJava.Materi.CodeExample01;

public class Example01 {
  public static void main(String[] args) {
    // new Person() => proses create new object, call constructor()
    Person dev = new Person();
    dev.name = "Dev";
    dev.age = 22;

    dev.perkenalanDiri();

    // =======================================

    System.out.println("=================================");
    Person jhon = new Person("Jhon", 25);
    jhon.perkenalanDiri();
  }
}
