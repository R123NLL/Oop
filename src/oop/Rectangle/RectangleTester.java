package oop.Rectangle;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(60,20);

        show("The perimeter of r1 is: ",r1.rectanglePerimeter());
        show("The area of r1 is: ",r1.rectangleArea());
        show("The perimeter of r2 is: ",r2.rectanglePerimeter());
        show("The area of r2 is: ",r2.rectangleArea());





    }

    private static void show(String string,int rectangle){
        System.out.println(string+rectangle);
        System.out.println("============================");
        System.out.println();
    }
}
