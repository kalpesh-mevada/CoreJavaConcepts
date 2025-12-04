package private_p2;

import private_p1.Fourth_A;
// Different Package Sub Class
// Inheritance should be happen.
public class Fourth_B extends Fourth_A{
	public static void main(String[] args) {
		Fourth_B b1 = new Fourth_B();
		//System.out.println(b1.i); // ERROR
		/* Error:The field Fourth_A.i is not visible
	       it should be protected or public visibility*/ 
	}
}
