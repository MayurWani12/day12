package com.proxy.twele;
public class Main {
    public static void main(String[] args) {
        BankAccountProxy accountProxy = new BankAccountProxy("Alice", 1000);

        // Authorized access
        accountProxy.deposit(200);
        accountProxy.withdraw(100);
        System.out.println("Balance: $" + accountProxy.getBalance("Alice")); // Authorized access

        // Unauthorized access
        System.out.println("Balance: $" + accountProxy.getBalance("Bob")); // Unauthorized access
    }
}
