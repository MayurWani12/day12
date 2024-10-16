package com.state.twenty;

public class NotStartedState implements ExamState {
    @Override
    public void handleState() {
        System.out.println("The exam has not started yet.");
    }
}