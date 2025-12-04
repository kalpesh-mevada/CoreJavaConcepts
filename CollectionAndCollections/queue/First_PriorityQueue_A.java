package queue;

import java.util.PriorityQueue;

/*	poll technique reads the element and transfer 
 	the control to next	element based on priority of data.
*/
public class First_PriorityQueue_A {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(10);
		queue.add(45);
		queue.add(100);
		queue.add(20);
		System.out.println(queue); 
		/* 	reads element and pointer transfer to next 
		 	based on priority*/
		System.out.println(queue.poll()); 
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}