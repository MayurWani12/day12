package com.state.twenty;

public class InProgressState implements ExamState {
    @Override
    public void handleState() {
        System.out.println("The exam is currently in progress.");
    }
}