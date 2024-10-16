package com.proxy.twele;
public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String accountHolder;

    public BankAccountProxy(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.realBankAccount = new RealBankAccount(initialBalance);
    }

    private boolean authenticate(String user) {
        return user.equals(accountHolder); // Simple authentication check
    }

    @Override
    public void deposit(double amount) {
        realBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        realBankAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        System.out.println("Access Denied: Unauthorized user trying to access balance.");
        return 0;
    }

    public double getBalance(String user) {
        if (authenticate(user)) {
            return realBankAccount.getBalance();
        } else {
            System.out.println("Access Denied: Unauthorized user.");
            return 0;
        }
    }
}
