package com.divergent.collectiondemo;

import java.util.HashSet;
import java.util.Set;

/**
 * stored in random ordered
 * 
 * @author Dell not allowed duplicate elements
 */
public class SetsDemo {
	public static void main(String[] args) {
		Set<Integer> x = new HashSet<Integer>();
		x.add(10);
		x.add(11);
		x.add(12);

		// System.out.println(x.add(15));
		// System.out.println(x.add(12));

		// System.out.println(x);

		Set<Integer> y = new HashSet<Integer>();
		//y.add(19);
		//y.add(13);
		y.add(11);

		// x.addAll(y); // union operation
		// System.out.println(x);

		//x.retainAll(y); // Intersection operation of set

		//System.out.println(x);
		// System.out.println(y);
		System.out.println(x.containsAll(y));  // it will check x is a subset of y
		System.out.println(x);

	}

}
