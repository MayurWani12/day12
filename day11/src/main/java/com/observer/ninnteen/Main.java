package com.observer.ninnteen;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Observer library = new LibraryDepartment();
        Observer sports = new SportsDepartment();

        student.registerObserver(library);
        student.registerObserver(sports);

        student.registerForCourse("Computer Science 101"); 
    }
}
