package oop.Employee;

public class Programmer extends Employee {
    public Programmer(String name, int serialId, int salary) {
        super(name, serialId, salary);
    }

    public double calcBonus() {
        return super.calcBonus(1.5);
    }

    @Override
    public void updateSalary(double salary) {
        this.salary = salary * calcBonus();
    }
}
