package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Third_LL_A {
	
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		// homogeneous data
		al.add(10); // 0 index in array
		al.add(5); // 1 index
		al.add(100); // 2 index
		Collections.sort(al);
		System.out.println(al);
		
		LinkedList al2 = new LinkedList();
		// homogeneous data
		al2.add("kalpesh"); // 0 index in array
		al2.add("anita"); // 1 index
		al2.add("hitesh"); // 2 index
		al2.add("himansu"); // 2 index
		Collections.sort(al2);
		System.out.println(al2);
	}
}
