package com.divergent.collectiondemo;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum months {
	january, febuary, march, april, may, jume, july, august, september, october, november, december
}

public class EnumSetDemo {

	public static void main(String[] args) {
		Set<months> set = EnumSet.of(months.march, months.april);

		// Traversing elements
		Iterator<months> itr = set.iterator();

		while (itr.hasNext()) {
		}
		System.out.println(itr.next());

		Set<months> m = EnumSet.allOf(months.class);
		System.out.println(m);
	}
}
