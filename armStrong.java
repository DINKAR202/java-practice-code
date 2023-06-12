import java.util.Scanner;

public class armStrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,c,rem,arm=0;
        System.out.println("Enter a number: ");

        n = sc.nextInt();
        c=n;    
        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        System.out.println(c);
        System.out.println(arm);
        if(c==arm){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }

    }

}
