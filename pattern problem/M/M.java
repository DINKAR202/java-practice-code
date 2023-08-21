public class M{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int c=1; c<=5; c++)
            {
                if(c==1 || c==5 || (c+i==6 & i<=3) || (i==c & i<=2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            
    }
}