package default_p2;

import default_p1.Example1_A;

public class Example1_B extends Example1_A {
	
	public static void main(String[] args) {
		 Example1_B b1 = new Example1_B();
		 System.out.println(b1.i);
		 b1.testPublic();
		 b1.testProtected();
		 // default member and method can't access
		 // private member and method can't access
	}
}
