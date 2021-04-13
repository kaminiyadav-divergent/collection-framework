package com.divergent.collectiondemo;

import java.util.Iterator;
import java.util.Stack;
/**
 * 
 * @author Dell
 *
 */
public class StackDemo {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		stack.pop();
		stack.add("kamini");
		 String peeked = stack.peek();
		 System.out.println("Peeked String is : "+peeked);
		 
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
