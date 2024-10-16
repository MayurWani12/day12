package com.proxy.twele;
public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
