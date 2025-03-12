package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumbers = filterEvent(numbers);
        System.out.println(evenNumbers); //2,4,6
    }
    public static List<Integer>filterEvent(List<Integer>numbers) {
        return numbers.stream()
                .filter(n -> n % 2 ==0)
                .collect(Collectors.toList());
    }
}
