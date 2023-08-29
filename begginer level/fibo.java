import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c,a=0,b=1,n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(a+" ");

            c=a+b;
            a=b;
            b=c;
        }
    }
}