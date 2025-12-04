package linkedList;

import java.util.Collections;
import java.util.LinkedList;
/*	When binary search is performing, data should be 
 	sorted and homogeneous.
*/
public class Fourth_LL_A {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		// homogeneous data
		al.add(10); // 0 index in array
		al.add(5); // 1 index
		al.add(100); // 2 index
		al.add(2); // 2 index
		Collections.sort(al);
		System.out.println(al);
		
		int index = Collections.binarySearch(al, 2);
		System.out.println("Searched : "+al.get(index));
		
	}
}	
