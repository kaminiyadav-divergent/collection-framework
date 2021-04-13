package com.divergent.collectiondemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("kamini");
		c.add("Satyam");
	

		Iterator<String> itr = c.iterator();
		itr.next();
		itr.remove();
		System.out.println(c);


		while (itr.hasNext()) {
			//System.out.println(itr.next());

		}
		//itr.remove();
		

	}
}
