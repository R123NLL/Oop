package oop.Adult;

public class AdultTester {
    public static void main(String[] args) {
        Adult a1=new Adult("Denis",186,"It");
        Adult a2=new Adult("Evelin",170);
        Adult a3=new Adult(a1);
        a1.setProfession("Java developer");


        show(a1.print());
        show(a2.print());
        show(a3.print());


    }


    private static void show(String adult){
        System.out.println(adult);
        System.out.println("==============================");
        System.out.println();
    }
}
