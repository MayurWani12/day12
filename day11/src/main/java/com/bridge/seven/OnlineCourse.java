package com.bridge.seven;

public class OnlineCourse implements Course {
    @Override
    public void enroll(String studentName) {
        System.out.println(studentName + " enrolled in an Online Course.");
    }

    @Override
    public void attendCourse(String studentName) {
        System.out.println(studentName + " is attending the Online Course.");
    }
}