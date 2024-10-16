package com.bridge.seven;
public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, Course course) {
        super(name, course);
    }

    @Override
    public void enrollInCourse() {
        System.out.println("Undergraduate Student: " + name);
        course.enroll(name);
    }

    @Override
    public void attend() {
        course.attendCourse(name);
    }
}