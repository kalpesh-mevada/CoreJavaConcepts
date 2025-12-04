package default_p2;

import private_p1.Fourth_A;

//Example of Different package Sub class
//Inheritance should be happen.
public class Fourth_B extends Fourth_A{
	
	public static void main(String[] args) {		
		Fourth_B b1 = new Fourth_B();
		//System.out.println(b1.i); //ERROR
		//b1.test(); //ERROR
	}

}
