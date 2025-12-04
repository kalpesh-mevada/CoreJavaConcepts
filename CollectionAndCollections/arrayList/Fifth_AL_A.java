package arrayList;

import java.util.ArrayList;
import java.util.Collections;
/* 	Searching data – make sure is it sorted. if not sorted, 
 	the it gives error.*/
public class Fifth_AL_A {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Homogeneous data - Not Sorted
		a.add(1000);
		a.add(100);
		a.add(5); 
		a.add(20);
		int index = Collections.binarySearch(a, 20);
		System.out.println(a.get(index));
	}
}
