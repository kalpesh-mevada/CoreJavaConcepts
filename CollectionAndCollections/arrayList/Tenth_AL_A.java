package arrayList;

import java.util.ArrayList;
/*	RemoveAll method will remove all the elements but 
 	not memory allocation of all the elements*/
public class Tenth_AL_A {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Homogeneous data -
		a.add(1000);
		a.add(100);
		a.add(5); 
		a.add(20);
		
		System.out.println(a.removeAll(a));
		System.out.println(a);
	}
}
