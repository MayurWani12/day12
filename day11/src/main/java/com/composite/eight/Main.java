package com.composite.eight;
public class Main {
    public static void main(String[] args) {
      
        IndividualEmployee emp1 = new IndividualEmployee("John Doe", 50000);
        IndividualEmployee emp2 = new IndividualEmployee("Jane Smith", 60000);

        Manager manager = new Manager("Michael Johnson", 80000);
        manager.add(emp1);
        manager.add(emp2);

       
        Manager seniorManager = new Manager("Emily Davis", 100000);
        seniorManager.add(manager);


        System.out.println("Senior Manager: " + seniorManager.getName() + ", Salary: " + seniorManager.getSalary());
        for (Employee emp : seniorManager.getSubordinates()) {
            System.out.println("  Manager: " + emp.getName() + ", Salary: " + emp.getSalary());
            if (emp instanceof Manager) {
                for (Employee subordinate : ((Manager) emp).getSubordinates()) {
                    System.out.println("    Employee: " + subordinate.getName() + ", Salary: " + subordinate.getSalary());
                }
            }
        }
    }
}
