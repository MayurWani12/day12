package com.visitor.twentythree;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
