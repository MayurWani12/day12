package com.state.twenty;

public class Student {
    private ExamState currentState;

    public void setState(ExamState state) {
        this.currentState = state;
    }

    public void checkExamStatus() {
        currentState.handleState();
    }
}
