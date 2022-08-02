package OOPJava.Materi.CodeExample01;

public class Person {
  // Attribute or Properties
  String name;
  int age;

  // Contoh Constructor(1)
  public Person() {
    System.out.println("Create new object ");
  }

  // Contoh Constructor(2) - Constructor with parameter
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Behaviour or Method
  void perkenalanDiri() {
    System.out.println("Hai nama saya : " + name);
    System.out.println("Umur saya     : " + age);
  }
}
