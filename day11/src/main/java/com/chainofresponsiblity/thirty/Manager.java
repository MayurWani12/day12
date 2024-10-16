package com.chainofresponsiblity.thirty;

public
class Manager extends Employee {
    @Override
    public void approvePurchase(double amount) {
        if (amount <= 20000) {
            System.out.println("Manager approved the purchase of $" + amount);
        } else {
            System.out.println("Purchase of $" + amount + " requires further approval beyond Manager.");
        }
    }
}
