package OOPJava.Materi.CodeExample02;

public class Person {
  // Attribute or Properties
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void perkenalanDiri() {
    System.out.println("Hai nama saya : " + name);
    System.out.println("Umur saya     : " + age);
  }
}
