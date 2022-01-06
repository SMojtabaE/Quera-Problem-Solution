import java.util.Scanner;

public class solve_1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(factoreal(i) / factoreal(i - j) / factoreal(j) + " ");
      }
      System.out.println();
    }
  }

  static int factoreal(int n) {
    int fact = 1;
    for (int i = 2; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }
}
/**
 * @author Mohammad YousefiPour - Github.com/myp79
 */
