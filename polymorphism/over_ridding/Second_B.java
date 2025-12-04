package over_ridding;

public class Second_B extends Second_A{

	int i = 20; // can't over ride variable
	
	public static void main(String[] args) {
		Second_B b = new Second_B();
		// this will not replace value.
		// over ride possible on logical statement
		System.out.println(b.i);		
	}
}
