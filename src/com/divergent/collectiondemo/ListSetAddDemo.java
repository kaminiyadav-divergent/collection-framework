package com.divergent.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ListSetAddDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("copy");
		list.add("pen");
		list.add("Pencil");
		// accessing the elements
		System.out.println(list);

		// it will replace the value
		list.set(0, "Book");

		// iterating the list elements using for-each loop
		for (String item : list) {
			System.out.println(item);
		}

	}
}
