package FundamentalJava;

public class ConditionalOperator {
  public static void main(String[] args) {
    // Digunakan untuk mengoperasikan 2 buah boolean.
    // Mengembalikan nilai boolean (true or false)

    /*
     * && operator AND (DAN)
     * || operator OR (ATAU)
     */

    int value1 = 1;
    int value2 = 2;

    if ((value1 == 1) && (value2 == 2))
      System.out.println("value1 is 1 AND value2 is 2");

    if ((value1 == 1) || (value2 == 1))
      System.out.println("value1 is 1 OR value2 is 1");

    int x = 7;
    int y = 3;

    boolean myCondition = x == y && true;
    System.out.println(myCondition);

    myCondition = x == y && false;
    System.out.println(myCondition);

    myCondition = !(x == y);
    System.out.println(myCondition);
  }
}
