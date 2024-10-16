package com.facade.ten;

public class EducationF {
    private Student student;
    private Course course;
    private Department department;

    public EducationF() {
        student = new Student();
        course = new Course();
        department = new Department();
    }

    public void enrollStudentInCourse(String studentName, String courseName) {
        System.out.println(studentName + " is enrolling in " + courseName);
        student.enroll(courseName);
    }

    public void addNewCourse(String courseName) {
        course.addCourse(courseName);
    }

    public void createNewDepartment(String departmentName) {
        department.createDepartment(departmentName);
    }
}