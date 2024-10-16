package com.interpret.fifteen;
public class Main {
    public static void main(String[] args) {
     
        Expression expr1 = new NumberExpression(5);
        Expression expr2 = new NumberExpression(10);

      
        Expression addExpr = new AddExpression(expr1, expr2);

        // Interpret the expression
        int result = addExpr.interpret();
        System.out.println("Result: " + result); // Output: Result: 15
    }
}
