import java.util.Scanner;

public class findfactor {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter a integer number ");
    int number = in.nextInt();

    System.out.print("Factors of " + number + " are: ");

    for (int i = 1; i <= number; ++i) {

      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}