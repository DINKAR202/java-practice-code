
class Employee{
    private int empID = 21;
    private int Ph = 0;
    private String Name;
    private int basicSal = 20000;
    private int incentive = 200;
    private void countSalaries(){
        System.out.println(basicSal + incentive);
    }
    // geter & setter
    int getph(){
        return Ph;
    } 
    String getName(){
        return Name;
    }
}





































// class encap {
//     public static void main(String[] args){
//         Employee engineer = new Employee();
//         System.out.println("Basic salary is "+ engineer.basicSal);
//         MyClass myClass = new MyClass();
//         myClass.print();
//     }
// }
