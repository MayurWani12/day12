package com.state.twenty;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

     
        student.setState(new NotStartedState());
        student.checkExamStatus();

        // Exam in progress
        student.setState(new InProgressState());
        student.checkExamStatus();

        // Exam completed
        student.setState(new CompletedState());
        student.checkExamStatus();
    }
}
