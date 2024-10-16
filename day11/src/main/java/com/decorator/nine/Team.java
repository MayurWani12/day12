package com.decorator.nine;

public class Team extends EmpD {
    public Team(Employee employee) {
        super(employee);
    }

    @Override
    public String getRole() {
        return super.getRole() + ", Team Lead";
    }
}