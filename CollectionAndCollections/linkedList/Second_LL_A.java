package linkedList;

import java.util.LinkedList;

/*Collection method same as Array List*/
public class Second_LL_A {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		// Heterogeneous data
		al.add(10); // 0 index in array
		al.add("kalpesh"); // 1 index
		al.add(10.3); // 2 index
		
		System.out.println(al.remove(1));
		System.out.println(al.size());
		al.retainAll(al);
		System.out.println(al);
		System.out.println(al.contains(10));
	}
}
