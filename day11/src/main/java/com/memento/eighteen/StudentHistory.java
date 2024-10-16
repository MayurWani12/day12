package com.memento.eighteen;
import java.util.Stack;

public class StudentHistory {
    private Stack<StudentMemento> history = new Stack<>();

    public void save(Student student) {
        history.push(student.save());
    }

    public void undo(Student student) {
        if (!history.isEmpty()) {
            student.restore(history.pop());
        } else {
            System.out.println("No states to undo.");
        }
    }
}
