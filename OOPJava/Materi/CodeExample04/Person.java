package OOPJava.Materi.CodeExample04;

public class Person {
  // Attribute dengan access modifier private
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // akses set data menggunakan method seter"
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // akses get data menggunakan method getter
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
