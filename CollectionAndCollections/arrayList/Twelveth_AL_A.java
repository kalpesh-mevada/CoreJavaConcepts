package arrayList;

import java.util.ArrayList;
/*	Compile Time Exception: The method add(Integer) in 
 	the type ArrayList<Integer> is not applicable 
 	for the arguments (String)
*/
public class Twelveth_AL_A {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// Homogeneous data -
		a.add(1000);
		a.add("kalpesh");
		a.add(5); 
		a.add(20);
		System.out.println();
	}
}
