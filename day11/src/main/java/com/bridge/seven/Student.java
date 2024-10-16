package com.bridge.seven;

public abstract class Student {
    protected Course course;
    protected String name;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public abstract void enrollInCourse();
    public abstract void attend();
}
