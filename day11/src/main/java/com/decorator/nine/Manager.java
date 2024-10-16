package com.decorator.nine;

public class Manager extends EmpD {
    public Manager(Employee employee) {
        super(employee);
    }

    @Override
    public String getRole() {
        return super.getRole() + ", Manager";
    }
}