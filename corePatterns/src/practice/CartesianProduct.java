package practice;

import java.util.ArrayList;
import java.util.List;

public class CartesianProduct {

    public static void main(String[] args) {
        // Input data
        List<String> list2 = List.of("a", "b", "c");
        List<String> list3 = List.of("d", "e", "f");

        // Calculate the Cartesian product
        List<String> result = cartesianProduct(list2, list3);

        // Print the result
        System.out.println(result);
    }

    public static List<String> cartesianProduct(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        // Nested loops to iterate through the lists
        for (String elem1 : list1) {
            for (String elem2 : list2) {
                // Concatenate elements and add to the result list
                result.add(elem1 + elem2);
            }
        }

        return result;
    }
}
