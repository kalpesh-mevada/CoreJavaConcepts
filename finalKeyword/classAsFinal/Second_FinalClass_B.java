package classAsFinal;

/*Final Class can inherited members of non-final class*/
final class Second_FinalClass_B extends Second_FinalClass_A {

	public static void main(String[] args) {
		Second_FinalClass_B b1 = new  Second_FinalClass_B();
		System.out.println(b1.i);
		// Not showing error but it will be compilation problem
		// The blank final field j may not have been initialized
		//System.out.println(b1.j);
	}
}
