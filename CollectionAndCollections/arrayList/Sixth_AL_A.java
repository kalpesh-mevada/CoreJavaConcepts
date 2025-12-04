package arrayList;

import java.util.ArrayList;
import java.util.Collections;
/*	contains will give true if data fetch, false 
 	if data not fetch.
 	-	Not required sorted data for contain 
 		operation*/
public class Sixth_AL_A {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Homogeneous data -
		a.add(1000);
		a.add(100);
		a.add(5); 
		a.add(20);
		System.out.println(a.contains(20));//true
		System.out.println(a.contains(200));//false
	}
}
