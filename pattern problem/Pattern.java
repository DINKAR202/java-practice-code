public class Pattern {
    public static void main(String[] args)
    {
        Pattern3(9);
    }

    static void pattern4(int n)
    {
        for(int a = 0;)
    }

    static void Pattern3(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
                System.out.print(i +" ");
            System.out.println();
            System.out.println("Hi there kaise ho abhi");
        }
    }

    static void pattern2(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern1(int n){
        for(int row = 1; row<=n; row++)
        {
            for(int col = 1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
