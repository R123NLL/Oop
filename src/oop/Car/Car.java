package oop.Car;

public class Car {
    private int carNumber;
    private  int currentSpeed;

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp(){
        this.currentSpeed++;
    }

    public void slowDown(){
        this.currentSpeed--;
    }

    public void status(){
        System.out.println("The car number is: "+this.carNumber);
        System.out.println("The current speed of the car is: "+this.currentSpeed);
    }
    public void stop(){
        this.currentSpeed=0;
    }


}
