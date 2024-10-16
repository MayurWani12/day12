package com.decorator.nine;

public class dd extends EmpD {
    public dd(Employee employee) {
        super(employee);
    }

    @Override
    public String getRole() {
        return super.getRole() + ", Manager";
    }
}