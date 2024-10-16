package com.bridge.seven;

public 
class GraduateStudent extends Student {
    public GraduateStudent(String name, Course course) {
        super(name, course);
    }

    @Override
    public void enrollInCourse() {
        System.out.println("Graduate Student: " + name);
        course.enroll(name);
    }

    @Override
    public void attend() {
        course.attendCourse(name);
    }
}
