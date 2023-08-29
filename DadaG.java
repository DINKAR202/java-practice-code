public class DadaG {
    String name = "Om Prakash";
    String surname= "Shrama";    
}
class Father extends DadaG{
    String name = "Vinod";
} 
class Me extends Father{
    String name = "Dinkar";
}

// class Run{
//     public static void main(String[] args){
//         Me m = new Me();
//         System.out.println(m.name);
//         System.out.println(m.surname);
//     }
// }