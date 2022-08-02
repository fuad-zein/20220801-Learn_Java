package OOPJava.Materi.CodeExample04;

import OOPJava.Materi.CodeExample04.Person;

public class Example04 {
  public static void main(String[] args) { // stuck dalam constructor encapsulation
    Person dev = new Person("Don", 25);
    // dev.setName("Dev");
    // dev.setAge(19);

    System.out.println(dev.getName());
    System.out.println(dev.getAge());
  }
}
