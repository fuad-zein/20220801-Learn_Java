package FundamentalJava.Materi;

public class Array {
  public static void main(String[] args) {
    int[] anArrays = {
        100, 200, 300, 400, 500
    };

    String[][] names = {
        { "Mr. ", "Mrs. ", "Ms. " },
        { "Smith", "Jones" }
    };

    System.out.println("Index ke 0 dengan nilai " + anArrays[0]);
    System.out.println("Index ke 1 dengan nilai " + anArrays[1]);
    System.out.println("Index ke 2 dengan nilai " + anArrays[2]);
    System.out.println("Index ke 3 dengan nilai " + anArrays[3]);
    System.out.println("Index ke 4 dengan nilai " + anArrays[4]);

    System.out.println("");

    System.out.println(names[0][0] + names[1][0]); // Mr. Smith
    System.out.println(names[0][2] + names[1][1]); // Ms. Jones
  }
}