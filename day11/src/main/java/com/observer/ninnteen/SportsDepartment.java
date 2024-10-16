package com.observer.ninnteen;

public class SportsDepartment implements Observer {
    @Override
    public void update(String courseName) {
        System.out.println("Sports Department notified of new course registration: " + courseName);
    }
}