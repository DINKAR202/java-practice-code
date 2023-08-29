import java.util.Scanner;

class leapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = sc.nextInt();

        if (y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
            
            System.out.println("This is leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }
    }
}