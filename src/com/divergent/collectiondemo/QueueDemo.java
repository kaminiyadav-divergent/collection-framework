package com.divergent.collectiondemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		// q.remove(); NoSuchElementException

		System.out.println(q.poll());
		q.add(10);
		q.add(11);
		q.add(13);
		q.add(14);
		q.add(15);

		q.remove();

		q.offer(16);// it will return boolean
		System.out.println(q.peek());

		System.out.println(q);

		System.out.println(q.element());

	}
}
