package corePatterns;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyPattern {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

        // Sorting the list in reverse order
        Collections.sort(numbers, Comparator.reverseOrder());

        // Printing the sorted list
        System.out.println("Sorted in reverse order: " + numbers);
    }
}
