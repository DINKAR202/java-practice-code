import java.util.Scanner;

class Sum_of_Digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int sum=0, r;

        while(num>0){
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println("Sum of Digits : "+ sum);
    }
}