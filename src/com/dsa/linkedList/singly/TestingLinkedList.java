package com.dsa.linkedList.singly;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestingLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);  // add(E e)
        list.add(20);
        list.add(1, 15);  // add(int index, E element)
        list.addFirst(5); // addFirst(E e)
        list.addLast(25); // addLast(E e)

        // Remove elements
        list.remove();    // remove() - removes head (first element)
        list.remove(2);   // remove(int index)
        list.remove(Integer.valueOf(20)); // remove(Object o)
        list.add(30);
        list.add(40);
        list.removeFirst();   // removeFirst()
        list.removeLast();    // removeLast()
        list.clear();         // clear() - remove all elements

        // Repopulate for access/peek
        list.addAll(Arrays.asList(100, 200, 300, 400, 500));

        // Access/peek methods
        int first = list.getFirst();      // getFirst()
        int last = list.getLast();        // getLast()
        int second = list.get(1);         // get(int index)
        int peeked = list.peek();         // peek()
        int peekFirst = list.peekFirst(); // peekFirst()
        int peekLast = list.peekLast();   // peekLast()

        // Update an element
        list.set(2, 350);  // set(int index, E element)

        // Querying
        boolean contains200 = list.contains(200);   // contains(Object o)
        boolean isEmpty = list.isEmpty();           // isEmpty()
        int idx = list.indexOf(350);                // indexOf(Object o)
        int lastIdx = list.lastIndexOf(500);        // lastIndexOf(Object o)
        int size = list.size();                     // size()

        // Iterators and Array conversion
        Iterator<Integer> it = list.iterator();                 // iterator()
        Iterator<Integer> descIt = list.descendingIterator();   // descendingIterator()
        ListIterator<Integer> listIt = list.listIterator(2);    // listIterator(index)
        Object[] array = list.toArray();                        // toArray()

        // Stack/Queue Operations
        list.push(50);      // push(E e)
        int popped = list.pop(); // pop()
        list.offer(600);    // offer(E e)
        list.offerFirst(700); // offerFirst(E e)
        list.offerLast(800);  // offerLast(E e)

        // Remove by occurrence
        list.removeFirstOccurrence(350); // removeFirstOccurrence(Object o)
        list.removeLastOccurrence(800);  // removeLastOccurrence(Object o)

        // Utility
        LinkedList<Integer> clone = (LinkedList<Integer>)list.clone(); // clone()
        System.out.println("LinkedList: " + list); // toString()
    }
}
