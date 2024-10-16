package com.memento.eighteen;

public class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public StudentMemento save() {
        return new StudentMemento(name);
    }

    public void restore(StudentMemento memento) {
        this.name = memento.getName();
    }
}
