package arrayList;

import java.util.ArrayList;

public class First_AL_A {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Heterogeneous data
		a.add(10); // Integer value
		a.add("kalpesh"); //String value
		a.add(10.3); // float value
		// Get data from array index
		System.out.println(a.get(1));
		// Find out size of collection
		System.out.println("ArrayList Size: "+a.size());
	}
}
