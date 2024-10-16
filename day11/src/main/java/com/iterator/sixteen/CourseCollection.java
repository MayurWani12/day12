package com.iterator.sixteen;
import java.util.ArrayList;
import java.util.List;

public class CourseCollection {
    private List<String> courses = new ArrayList<>();

    public void addCourse(String course) {
        courses.add(course);
    }

    public Iterator<String> iterator() {
        return new CourseIterator();
    }

    private class CourseIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < courses.size();
        }

        @Override
        public String next() {
            return hasNext() ? courses.get(index++) : null;
        }
    }
}
