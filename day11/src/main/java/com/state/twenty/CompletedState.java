package com.state.twenty;

public class CompletedState implements ExamState {
    @Override
    public void handleState() {
        System.out.println("The exam is completed.");
    }
}