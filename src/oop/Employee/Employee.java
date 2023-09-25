package oop.Employee;

public class Employee {
    protected String name;
    protected int serialId;
    protected double salary;

    public Employee(String name, int serialId, int salary){
        this.name=name;
        this.setSerialId(serialId);
        this.salary=salary;
    }

    public String toString(){
        return "Employee's name is: "+name+"\tSerial id is: "+serialId+"\tSalary is: "+salary;
    }
    public double calcBonus(double bonus){
        return bonus;
    }

    public void updateSalary(double salary){
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialId() {
        return serialId;
    }

    public void setSerialId(int serialId) {
        if (serialId>=1000){
            this.serialId=serialId;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
