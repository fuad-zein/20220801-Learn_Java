package OOPJava.Materi.CodeExample03;

public class Person {
  // Attribute or Properties
  String name;
  int age;

  public Person() { // Overloading => class sama
    System.out.println("");
    System.out.println("=================");
    System.out.println("Create new object");
    System.out.println("=================");
  }

  public Person(String name, int age) { // Overloading => class sama
    this.name = name;
    this.age = age;
  }

  void perkenalanDiri() { // Overloading => nama method sama
    System.out.println("Hai nama saya : " + name);
    System.out.println("Umur saya     : " + age);
  }

  void perkenalanDiri(String name, int age) { // Overloading => nama method sama
    // parameter beda
    // return value beda

    System.out.println("---------------------------");
    System.out.println("Hai nama saya : " + name);
    System.out.println("Umur saya     : " + age);
  }
}
