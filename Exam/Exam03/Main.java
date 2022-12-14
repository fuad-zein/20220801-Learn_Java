package Exam.Exam03;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Employee fuzi = new Employee(
        06,
        "Doni",
        "H",
        6000);

    // fuzi.setSalary(6000);

    System.out.println();
    System.out.println("============================================");
    System.out.println("ID Employee               : " + fuzi.getID());
    System.out.println("FirstName Employee        : " + fuzi.getFirstName());
    System.out.println("LastName Employee         : " + fuzi.getLastName());
    System.out.println("FullName Employee         : " + fuzi.getName());
    System.out.println("Salary Employee           : " + fuzi.getSalary());
    System.out.println("Annual Salary Employee    : " + fuzi.getAnnualSalary());
    System.out.println();

    Scanner in = new Scanner(System.in);
    int Salary = fuzi.raiseSalary();
    System.out.print("Input Percentage Value    : ");
    int percent = in.nextInt();
    int increaseSalary = Salary + (Salary * percent / 100);
    System.out.println("Increase Salary Employee  : " + percent + "% = " + increaseSalary);
    System.out.println();

    System.out.println(fuzi.toString() + ", Raise Salary = " + increaseSalary + "]");
    System.out.println("============================================");

    Manager budi = new Manager(
        "Administrasi",
        "Mengontrol Administrasi",
        3,
        "Budi",
        "Doremi",
        10000);

    System.out.println();
    System.out.println("============================================");
    System.out.println("ID Employee               : " + budi.getID());
    System.out.println("FirstName Employee        : " + budi.getFirstName());
    System.out.println("LastName Employee         : " + budi.getLastName());
    System.out.println("FullName Employee         : " + budi.getName());
    System.out.println("Salary Employee           : " + budi.getSalary());
    System.out.println("Annual Salary Employee    : " + budi.getAnnualSalary());
    System.out.println("Divisi : " + budi.getDivisi());
    System.out.println();

    budi.jobDesk();
    fuzi.jobDesk();
  }
}
