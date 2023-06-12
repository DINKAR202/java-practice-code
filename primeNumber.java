import java.util.Scanner;

class primeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        int counts = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                counts++;
            }
        }
        if(counts==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}