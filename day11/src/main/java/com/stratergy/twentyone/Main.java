package com.stratergy.twentyone;

public  class Main {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();
        int[] array = {5, 3, 8, 6, 2};

        context.setSortStrategy(new BubbleSort());
        context.sortArray(array); // Output: Using Bubble Sort
    }
}
