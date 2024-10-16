package com.facade.ten;
public class Main {
    public static void main(String[] args) {
        EducationF educationF = new EducationF();

        
        educationF.enrollStudentInCourse("ssoe", "Mathematics");

        educationF.addNewCourse("Physics");

        educationF.createNewDepartment("Science");
    }
}