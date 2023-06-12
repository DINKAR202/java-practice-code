import java.util.Scanner;

public class StrongNo {
    
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int n1 = n;

        while (n != 0) {
            int d = n % 10;
            sum += factorial(d);
            n /= 10;
        }
        
        if (sum == n1)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}
