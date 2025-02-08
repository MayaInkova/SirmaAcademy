package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]) {
        // create a linked list
        LinkedList ll = new LinkedList();
        // add elements to the linked list
        ll.add("I");
        ll.add("am");
        ll.add("example");
        ll.add("!");
        System.out.println("Original contents of ll: " + ll);
        // remove elements from the linked list
        ll.remove("!");
        ll.remove(2);
        System.out.println("Contents of ll after deletion: " + ll);
        // remove first and last elements
        ll.removeFirst();
        ll.removeLast();
    }
}
