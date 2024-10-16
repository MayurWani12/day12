package com.chainofresponsiblity.thirty;
public abstract class Employee {
    protected Employee nextEmployee;

    // Sets the next employee in the chain
    public void setNextEmployee(Employee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }

    // Handle the request or pass it along the chain
    public abstract void approvePurchase(double amount);
}
