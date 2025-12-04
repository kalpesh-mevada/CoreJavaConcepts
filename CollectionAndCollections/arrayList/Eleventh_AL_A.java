package arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*	ContainsAll method will helps us to complete the data of 
  	two collection but order is not mandatory*/
public class Eleventh_AL_A {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Homogeneous data
		a.add(1000);
		a.add(100);
		a.add(5); 
		a.add(20);
		
		ArrayList a1 = new ArrayList();
		// Homogeneous data - Not Sorted
		a.add(5);
		a.add(3); 	
		System.out.println(a.containsAll(a1));
	}
}
