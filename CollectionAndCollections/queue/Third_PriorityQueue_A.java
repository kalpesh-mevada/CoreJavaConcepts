package queue;

import java.util.PriorityQueue;

public class Third_PriorityQueue_A {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(10);
		queue.add(45);
		queue.add(100);
		queue.add(20);
		System.out.println(queue); 
		System.out.println(queue.contains(100));
		System.out.println(queue.remove(45));
		System.out.println(queue); 
		System.out.println(queue.containsAll(queue));
		System.out.println(queue.removeAll(queue));
		System.out.println(queue); 
	}

}
