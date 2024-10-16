package com.chainofresponsiblity.thirty;
public class Main {
    public static void main(String[] args) {
        // Create employee levels
        Employee juniorEmployee = new JuniorEmployee();
        Employee seniorEmployee = new SeniorEmployee();
        Employee manager = new Manager();

        // Set the chain of responsibility
        juniorEmployee.setNextEmployee(seniorEmployee);
        seniorEmployee.setNextEmployee(manager);

        // Process different purchase requests
        juniorEmployee.approvePurchase(600);    // Handled by Junior Employee
        juniorEmployee.approvePurchase(3000);   // Handled by Senior Employee
        juniorEmployee.approvePurchase(12000);  // Handled by Manager
        juniorEmployee.approvePurchase(50000);  // Escalates beyond Manager
    }
}
