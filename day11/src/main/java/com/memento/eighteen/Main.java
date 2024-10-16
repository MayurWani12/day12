package com.memento.eighteen;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentHistory history = new StudentHistory();

        student.setName("John Doe");
        history.save(student);

        student.setName("Jane Smith");
        history.save(student);

        student.setName("Alice Johnson");
        System.out.println("Current Name: " + student.getName()); 

        history.undo(student);
        System.out.println("After Undo: " + student.getName());   

        history.undo(student);
        System.out.println("After Undo: " + student.getName());   
    }
}
