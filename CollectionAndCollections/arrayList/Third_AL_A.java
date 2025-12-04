package arrayList;

import java.util.ArrayList;
import java.util.Collections;
/*	Collections in java is class that help us to perform sorting, 
  	searching on collection.
  	-	Collection can be sorted only when there is homogeneous 
  		data.*/
public class Third_AL_A {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Homogeneous data - all int value
		a.add(10);
		a.add(5);
		a.add(100); 
		Collections.sort(a);
		System.out.println(a);
	}
}
