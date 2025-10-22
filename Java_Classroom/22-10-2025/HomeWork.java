//22-10-2025
package com.codegnan.collections;
import java.util.*;

public class HomeWork {
	 public static void main(String[] args) {
	        // Create a List using ArrayList
	        List<Integer> numbers = new ArrayList<>();

	        // Add elements to the list
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        System.out.println("Initial List: " + numbers);

	        // 1️.add(int index, Object o)
	        numbers.add(2, 25);  // Insert 25 at index 2
	        System.out.println("After add(2, 25): " + numbers);

	        // 2️.addAll(int index, Collection c)
	        List<Integer> extraNumbers = new ArrayList<>();
	        extraNumbers.add(50);
	        extraNumbers.add(60);
	        numbers.addAll(3, extraNumbers); // Insert all at index 3
	        System.out.println("After addAll(3, extraNumbers): " + numbers);

	        // 3️.get(int index)
	        System.out.println("Element at index 4: " + numbers.get(4));

	        // 4️.remove(int index)
	        System.out.println("Removed element at index 5: " + numbers.remove(5));
	        System.out.println("After remove(5): " + numbers);

	        // 5️.set(int index, Object new)
	        numbers.set(1, 22);  // Replace element at index 1
	        System.out.println("After set(1, 22): " + numbers);

	        // 6️.indexOf(Object o)
	        System.out.println("Index of first occurrence of 25: " + numbers.indexOf(25));

	        // 7️.lastIndexOf(Object o)
	        numbers.add(25); // Add duplicate to show lastIndexOf
	        System.out.println("After adding another 25: " + numbers);
	        System.out.println("Last index of 25: " + numbers.lastIndexOf(25));

	        // 8️.listIterator()
	        System.out.print("Iterating forward using ListIterator: ");
	        ListIterator<Integer> iterator = numbers.listIterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }

	        System.out.print("\nIterating backward using ListIterator: ");
	        while (iterator.hasPrevious()) {
	            System.out.print(iterator.previous() + " ");
	        }

	        System.out.println("\n\nFinal List: " + numbers);
	    }
	}
