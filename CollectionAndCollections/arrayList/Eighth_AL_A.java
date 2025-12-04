package arrayList;

import java.util.ArrayList;
/*Remove method will remove only one element from given index*/
public class Eighth_AL_A {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Homogeneous data -
		a.add(1000);
		a.add(100);
		a.add(5); 
		a.add(20);
		System.out.println("Removed Element is :"+a.remove(0));
		System.out.println(a);
	}
}
