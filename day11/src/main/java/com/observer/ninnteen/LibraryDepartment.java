package com.observer.ninnteen;

public class LibraryDepartment implements Observer {
    @Override
    public void update(String courseName) {
        System.out.println("Library Department notified of new course registration: " + courseName);
    }
}
