package oop.Cat;

import oop.Person.Person;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Cat cat1=new Cat("Jesse",5,"Tabby");
        StreetCat streetcat1=new StreetCat("Tom",5,"Grey",10);
        SiamiCat siamicat1=new SiamiCat("Luke",5,"Beige","Wet");
        System.out.println("Enter cat's name,whiskers length,color and number of fights");
        StreetCat streetCat2=new StreetCat(scanner.next(),scanner.nextInt(), scanner.next(),scanner.nextInt());
        System.out.println("Enter cat's name,whiskers length,color and favorite food");
        SiamiCat siamiCat2=new SiamiCat(scanner.next(),scanner.nextInt(),scanner.next(),scanner.next());
        scanner.close();

        Print(cat1);
        Print(siamicat1);
        Print(siamicat1);
        Print();
        Print(streetCat2);
        Print(siamiCat2);






    }
    private static void Print(Cat cat){
        System.out.println(cat);
    }
    private static void Print(StreetCat streetCat){
        System.out.println(streetCat);
    }
    private static void Print(SiamiCat siamiCat){
        System.out.println(siamiCat);
    }
    private static void Print(){
        System.out.println("===================================");
    }
}