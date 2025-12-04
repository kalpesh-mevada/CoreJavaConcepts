package over_ridding_p2;

import private_p1.Fourth_A;

public class Second_AccessSpecifier_B extends Fourth_A{

	
	@Override
	public void testA() {
		System.out.println("From Test Method B");		
	}	
	public static void main(String[] args) {
		Second_AccessSpecifier_B b = new Second_AccessSpecifier_B();
		b.testA();
	}
}
