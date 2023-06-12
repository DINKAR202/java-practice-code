import java.util.Scanner;
public class reverse_string{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a String : ");
        char[] letters = sca.nextLine().toCharArray();
        System.out.println("Reverse string: ");
        for(int i=letters.length; i>=0;i--){
            System.out.println(letters[i]);
        }
        System.out.print("\n");
    }
}