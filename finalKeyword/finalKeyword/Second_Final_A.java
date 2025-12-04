package finalKeyword;
/*	ERROR: Without initialize:
	The blank final field i may not have been initialized*/
public class Second_Final_A {
	//final int i; // Non-static Error without initialize
	//final static int k; // Static Error without initialize
	final int i = 10;
	public static void main(String[] args) {
		final int j;
//Error: The local variable j may not have been initialized.
//System.out.println(j); // while using it, then error in local variable
	}
}
