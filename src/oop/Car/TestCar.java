package oop.Car;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car c1 = new Car();

        c1.setCarNumber(71630702);
        System.out.println("What is the speed that you want the car to go?");
        int speed = scanner.nextInt();
        for (int i = 0; i < speed; i++) {
            c1.speedUp();
        }
        c1.status();
        System.out.println();
        c1.slowDown();
        c1.slowDown();
        c1.status();
        System.out.println();
        c1.stop();
        c1.status();
        System.out.println();

    }
}
