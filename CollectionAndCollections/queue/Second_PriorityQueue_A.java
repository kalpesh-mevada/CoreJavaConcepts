package queue;

import java.util.PriorityQueue;

/*	peek technique reads the top element and transfer 
 	the control to again on top element.*/
public class Second_PriorityQueue_A {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(10);
		queue.add(45);
		queue.add(100);
		queue.add(20);
		System.out.println(queue); 
		/* 	reads the top element and transfer 
 			the control to again on top element*/
		System.out.println(queue.peek()); // peek
		System.out.println(queue.peek()); // peek
		System.out.println(queue.poll()); // poll
		System.out.println(queue.peek()); // peek	
		System.out.println(queue.peek()); // peek
	}

}
