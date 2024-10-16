package com.observer.ninnteen;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Observer> observers = new ArrayList<>();
    private String courseName;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void registerForCourse(String courseName) {
        this.courseName = courseName;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(courseName);
        }
    }
}
