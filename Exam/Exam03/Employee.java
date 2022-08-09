package Exam.Exam03;

public class Employee {
  private String firstName;
  private int id;
  private String lastName;
  private int salary;
  // int percent;

  public Employee(
      int id,
      String fristName,
      String lastName,
      int salary) {
    this.id = id;
    this.firstName = fristName;
    this.lastName = lastName;
    this.salary = salary;
  }

  // method setter (write)
  public void setID(int id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  // method getter (read)
  public int getID() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public int getSalary() {
    return salary;
  }

  public int getAnnualSalary() {
    return salary * 12;
  }

  public int raiseSalary() {
    return salary;
  }

  // toString()
  public String toString() {
    return "Employee [id = " + id + ", name = " + firstName + " " + lastName + ", salary = " + salary;
  }

  public void jobDesk() {
    System.out.println("Employee");
  }
}
