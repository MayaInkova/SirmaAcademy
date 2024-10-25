package SetsEndMaps;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем дължините на двете множества N и M
        String[] lengths = scanner.nextLine().split(" ");
        int N = Integer.parseInt(lengths[0]);
        int M = Integer.parseInt(lengths[1]);

        // Списъци за двете множества
        List<Integer> firstSet = new ArrayList<>();
        List<Integer> secondSet = new ArrayList<>();

        // Четем N числа за първото множество
        for (int i = 0; i < N; i++) {
            firstSet.add(scanner.nextInt());
        }

        // Четем M числа за второто множество
        for (int i = 0; i < M; i++) {
            secondSet.add(scanner.nextInt());
        }

        // Използваме HashSet, за да запазим уникалните числа от първото множество
        Set<Integer> uniqueInFirst = new HashSet<>(firstSet);

        // Използваме LinkedHashSet, за да запазим реда на повтарящите се числа
        Set<Integer> commonUnique = new LinkedHashSet<>();

        // Проверяваме кои числа от второто множество съществуват в първото
        for (int num : secondSet) {
            if (uniqueInFirst.contains(num)) {
                commonUnique.add(num);
            }
        }

        // Принтиране на резултата
        System.out.println("Set that contains all repeating elements -> " + commonUnique);

    }
}

