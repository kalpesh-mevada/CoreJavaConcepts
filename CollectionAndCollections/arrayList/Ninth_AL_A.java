package arrayList;

import java.util.ArrayList;
/*	Clear method will remove all the elements as well as memory
  	allocation of all the elements*/
public class Ninth_AL_A {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Homogeneous data -
		a.add(1000);
		a.add(100);
		a.add(5); 
		a.add(20);
		
		a.clear();
		System.out.println(a);
		System.out.println(a.indexOf(a));
	}
}
