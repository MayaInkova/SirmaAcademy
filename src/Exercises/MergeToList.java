package Exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class MergeToList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        List<Integer> mergedList = mergeLists(list1, list2);
        System.out.println(mergedList); // 1, 2, 3, 4, 5
    }

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> uniqueElements = new HashSet<>();
        uniqueElements.addAll(list1);
        uniqueElements.addAll(list2);

        return new ArrayList<>(uniqueElements);
    }

}
