import java.util.Scanner;

class NaturalSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
             sum = sum+i;
        }
        System.out.println("Addition of the Natural Number: "+ sum);
    }
}