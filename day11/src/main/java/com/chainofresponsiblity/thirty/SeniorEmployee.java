package com.chainofresponsiblity.thirty;


 public class SeniorEmployee extends Employee {
    @Override
    public void approvePurchase(double amount) {
        if (amount <= 5000) {
            System.out.println("Senior Employee approved the purchase of $" + amount);
        } else if (nextEmployee != null) {
            nextEmployee.approvePurchase(amount);
        }
    }
}