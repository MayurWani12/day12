package com.decorator.nine;

public abstract class EmpD implements Employee {
    protected Employee employee;

    public EmpD(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getRole() {
        return employee.getRole();
    }
}
