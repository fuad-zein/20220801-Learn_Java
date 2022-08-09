package Exam.Exam03;

public class Manager extends Employee {
  private String divisi;
  private String jobTitle;

  public Manager(
      String divisi,
      String jobTitle,
      int id,
      String firstName,
      String lastName,
      int salary) {
    super(id, firstName, lastName, salary);
    this.divisi = divisi;
    this.jobTitle = jobTitle;
  }

  public String getDivisi() {
    return divisi;
  }

  @Override
  public void jobDesk() {
    System.out.println("Manager");
  }
}
