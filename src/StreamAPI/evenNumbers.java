package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumbers = filterEven(numbers);
        System.out.println(evenNumbers);
    }
    public  static  List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream() //създава поток от списък
                .filter(n -> n % 2==0)  //оставяме само четните числа
                .collect(Collectors.toList()); //събира резултата обратно в списъка
    }
}
