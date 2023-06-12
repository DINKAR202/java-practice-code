import java.util.Scanner;
public class reverse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");

        int num = sc.nextInt();

        //algorithm

        // int rev=0;
        // while(num !=0 ){
        //     rev = rev*10 + num%10;
        //     num = num/10;
        // }

        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        
        System.out.println("Reverse no is : " + rev);
    }
}
