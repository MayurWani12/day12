package com.bridge.seven;

 public class BridgePatternUniversityExample {
    public static void main(String[] args) {
        Course onlineCourse = new OnlineCourse();
        Course inPersonCourse = new InPersonCourse();

        Student undergrad = new UndergraduateStudent("Alice", onlineCourse);
        Student grad = new GraduateStudent("Bob", inPersonCourse);

        // Students enroll in and attend courses
        undergrad.enrollInCourse();
        undergrad.attend();

        grad.enrollInCourse();
        grad.attend();
    }
}