public class swap{
    public static void main(String[] args){
        int a,b,temp;
        a=10;
        b=20;
        System.out.println("These are the before swap A " +a+ " B " +b );

        temp = a;
        a=b;    
        b = temp;
        System.out.println("These are the after swap A " +a+ " B " +b );
    }
}