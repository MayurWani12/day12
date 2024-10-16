package com.composite.eight;
import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary + subordinates.stream().mapToDouble(Employee::getSalary).sum();
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }
}
