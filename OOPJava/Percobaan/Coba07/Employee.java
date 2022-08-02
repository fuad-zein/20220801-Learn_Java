package OOPJava.Percobaan.Coba07;

public class Employee extends Person {
  public Employee() {
    // eksekusi konstrultor induk
    super();

    System.out.println("Eksekusi konstruktor Employee()");
  }

  public void info() {
    super.showMessage();
  }
}
