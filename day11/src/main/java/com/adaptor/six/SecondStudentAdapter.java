package com.adaptor.six;
public class SecondStudentAdapter implements Student {
    private SecondStudent secondStudent;

    public SecondStudentAdapter(SecondStudent secondStudent) {
        this.secondStudent = secondStudent;
    }

    @Override
    public String getName() {
        return secondStudent.getFullName();
    }

    @Override
    public int getAge() {
        return secondStudent.getYearsOld();
    }
}
