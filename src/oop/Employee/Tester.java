package oop.Employee;

public class Tester {
    public static void main(String[] args) {
        Programmer programmer1=new Programmer("Denis",1000,20000);
        Secratry secratry1=new Secratry("Adva",1002,8000,10);
        Print(programmer1);
        Print(secratry1);
        programmer1.updateSalary(programmer1.getSalary());
        secratry1.updateSalary(secratry1.getSalary());
        Print();
        Print(programmer1);
        Print(secratry1);



    }
    private static void Print(Employee employee){
        System.out.println(employee);
    }
    private static void Print(Programmer programmer){
        System.out.println(programmer);
    }

    private static void Print(Secratry secratry){
        System.out.println(secratry);
    }

    private static void Print(){
        System.out.println("=================================");
    }
}
