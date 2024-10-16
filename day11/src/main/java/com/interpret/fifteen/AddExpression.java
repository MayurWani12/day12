package com.interpret.fifteen;

public class AddExpression implements Expression {
    private Expression leftExpr;
    private Expression rightExpr;

    public AddExpression(Expression leftExpr, Expression rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    public int interpret() {
        return leftExpr.interpret() + rightExpr.interpret();
    }
}