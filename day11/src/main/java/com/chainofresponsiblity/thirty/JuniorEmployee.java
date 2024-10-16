package com.chainofresponsiblity.thirty;
public class JuniorEmployee extends Employee {
    @Override
    public void approvePurchase(double amount) {
        if (amount <= 1000) {
            System.out.println("Junior Employee approved the purchase of $" + amount);
        } else if (nextEmployee != null) {
            nextEmployee.approvePurchase(amount);
        }
    }
}

