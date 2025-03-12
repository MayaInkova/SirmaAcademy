package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueElementsInList {
    public static List<Integer> uniqueElements(List<Integer> numbers) {
        return new ArrayList<>(new HashSet<>(numbers));
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println(uniqueElements(numbers));
    }
}



