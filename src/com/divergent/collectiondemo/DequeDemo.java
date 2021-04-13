package com.divergent.collectiondemo;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * rrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, 
 * we can add or delete the elements from both the ends.
 * 
 * @author Dell
 *
 *ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
 */
public class DequeDemo {

	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		//deque.getFirst();
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
	}
}
