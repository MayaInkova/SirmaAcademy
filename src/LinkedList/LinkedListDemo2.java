package LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>(); {
            numbers.add(5);
            numbers.add(10);
            numbers.add(3);
            numbers.add(12);
            numbers.add(7);

            System.out.println("List" + numbers);

            numbers.remove(Integer.valueOf(3)); //Премахване по стойност

            System.out.println("After remove number in List"+ numbers);

            int max = Collections.max(numbers);
            System.out.println("Max number in list is:" + max);

            System.out.println("End List:"+numbers);
        }
    }
}
