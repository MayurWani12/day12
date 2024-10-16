package com.bridge.seven;

public class InPersonCourse implements Course {
    @Override
    public void enroll(String studentName) {
        System.out.println(studentName + " enrolled in an In-Person Course.");
    }

    @Override
    public void attendCourse(String studentName) {
        System.out.println(studentName + " is attending the In-Person Course.");
    }
}
