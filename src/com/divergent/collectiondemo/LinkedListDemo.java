package com.divergent.collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * LinkedList implements the Collection interface. 
 * It uses a doubly linked list internally to store the elements. 
 * @author Dell
 *It can store the duplicate elements. It maintains the insertion order and is not synchronized. 
 *In LinkedList, the manipulation is fast because no shifting is required.
 */
public class LinkedListDemo {

	public static void main(String args[]) {
		LinkedList<String> a = new LinkedList<String>(); //creating linklist
		a.add("Ravi");
		a.add("Vijay");
		a.add("Ravi");
		a.add("Ajay");
		a.remove("Ajay");
		Iterator<String> itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
