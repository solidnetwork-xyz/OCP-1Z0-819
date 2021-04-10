package com.prottonne.hr;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int anId, String aName, double aSalary) {
        this.id = anId;
        this.name = aName;
        this.salary = aSalary;
    }

    public void setId(int anId) {
        this.id = anId;
    }

    public int getId() {
        return id;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double aSalary) {
        this.salary = aSalary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + id + " " + name + " " + salary;
    }

}
