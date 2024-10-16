package com.iterator.sixteen;
public class Main {
    public static void main(String[] args) {
        CourseCollection courseCollection = new CourseCollection();
        courseCollection.addCourse("Math");
        courseCollection.addCourse("Science");
        courseCollection.addCourse("History");

        Iterator<String> iterator = courseCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
