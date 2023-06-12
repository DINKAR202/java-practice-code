import java.util.Scanner;

class fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n,fact=1;
        System.out.print("Enter a Number : ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.print("Factorial is : "+ fact);
    }
}