package classCastWithCastException;
/*	In Up casting, overriding method will be called and 
	not overridden.*/
public class Second_ClassUpCast_B extends Second_ClassUpCast_A {

	@Override
	public void test(){
		System.out.println("Test Method B");
	}
	public static void main(String[] args) {
		Second_ClassUpCast_A a1 = new Second_ClassUpCast_B();
		// In up casting, overriding method called 
		// and not overridden
		a1.test();
	}
}
