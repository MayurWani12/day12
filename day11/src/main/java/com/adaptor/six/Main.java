package com.adaptor.six;

public class Main {
    public static void main(String[] args) {
        
        Student collegeStudent = new CollegeStudent("Alice", 20);
        System.out.println("College Student: " + collegeStudent.getName() + ", Age: " + collegeStudent.getAge());


        SecondStudent secondStudent = new SecondStudent("Bob Smith", 22);
        Student adaptedStudent = new SecondStudentAdapter(secondStudent);
        System.out.println("Adapted Second Student: " + adaptedStudent.getName() + ", Age: " + adaptedStudent.getAge());
    }
}
