import java.util.Scanner;

public class findfactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<n; i++){
            if(n%i == 0){
                sum = sum+i;
            }
        }
        if(sum==n){
            System.out.println("this is factor number");
        }
        else{
            System.out.println("These are not a factor number");
        }
    }
}