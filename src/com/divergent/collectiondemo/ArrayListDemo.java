package com.divergent.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The ArrayList class implements the List interface. 
 * It uses a dynamic array to store the duplicate element of different data types.
 * @author Dell
 * The ArrayList class maintains the insertion order and is non-synchronized. 
 * The elements stored in the ArrayList class can be randomly accessed. 
 *
 */
class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");  // Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.remove(1);
		
		
		//Traversing list through Iterator  
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
