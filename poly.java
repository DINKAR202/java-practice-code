
class Features{
    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void add(double a, double b){
        System.out.println(a+b);
    }
}



public class poly {
    public static void main(String[] args){
        Features.add(a: 2, b: 3);
        // Features.add(a: 2.2, b: 3.3);
    }
}
