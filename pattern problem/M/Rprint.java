public class Rprint {
    public static void main(String args[])
    {
        int k =1;
        for(int r=1;r<=6;r++)
        {
            for(int c=1;c<=5;c++)
            {
                if(c==1 || r==1 || r==3 || (c==5 & r<=2) || r+c==k)
                {
                    System.out.print(" *");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            k=k+2;
        }
    }
}
