package OOPJava.Materi.CodeExample03;

// Overriding => berada pada subclass dengan class Person
public class Employee extends Person {
  String employeeId;
  String jobTitle;
  int salary;

  public Employee(
      String employeeId,
      String jobTitle,
      int salary,
      String name,
      int age) {
    super(name, age);
    this.employeeId = employeeId;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }

  void perkenalanDiri() { // Overriding => nama method sama
    // Overriding => parameter sama
    // Overriding => return value sama

    // Call parent class or super class attribute
    System.out.println("Hai nama saya : " + name);
    System.out.println("Umur saya     : " + age);

    // Call child class or subclass attribute
    System.out.println("Employee Id   : " + employeeId);
    System.out.println("Job Title     : " + jobTitle);
    System.out.println("Salary        : " + salary);
  }
}
