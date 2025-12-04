package P2;

import P1.First_A_P1;

/*Using Inheritance we can access different package's class
 member with creating object with child class*/
public class First_C_P2 extends First_A_P1 {
	
	public static void main(String[] args) {
		First_C_P2 c1 = new First_C_P2();
		System.out.println(c1.i);
		System.out.println(c1.j);
	}
}
