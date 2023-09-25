package oop.Employee;

public class Secratry extends Employee {
    protected int numOfEmailPerMinute;

    public Secratry(String name, int serialId, int salary, int numOfEmailPerMinute) {
        super(name, serialId, salary);
        this.numOfEmailPerMinute = numOfEmailPerMinute;
    }

    public String toString() {
        return super.toString() + "\tNumber of Emails saved per minute is: " + numOfEmailPerMinute;
    }

    public double calcBonus() {
        return super.calcBonus(500);
    }

    @Override
    public void updateSalary(double salary) {
        this.salary = salary + calcBonus();
    }
}
