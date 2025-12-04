package arrayList;

import java.util.ArrayList;
import java.util.Collections;
/* Collection can be use sorted only when data is 
 	Homogeneous*/ 	
public class Fourth_AL_A {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Heterogeneous data
		a.add(10);
		a.add("Kalpesh");
		a.add(100); 
		Collections.sort(a);
		System.out.println(a);
	}
}
