package com.divergent.collectiondemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
/**
 * LinkedHashSet class represents the LinkedList implementation of Set Interface. 
 *
 *It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. 
 *It maintains the insertion order and permits null elements.
 *
 */
public class LinkedHashSetDemo {
	public static void main(String args[]){  
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
