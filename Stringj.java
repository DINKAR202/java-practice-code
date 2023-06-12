public class Stringj {
        public static void main(String[] args){
            String s = "Dinkar";
            String rev ="";
            int len=s.length();
            for(int i =len-1; i>=0; i--)
            {
                rev=rev+s.charAt(i);
            }
            System.out.println("Reverse string is " +rev);
            // System.out.println(s.charAt(2));
        }    
}
