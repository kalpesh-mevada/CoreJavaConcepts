package static_inner;
/*	Class have default value is null, String args as null.
 * 	We can create main method inside static inner class but 
 	then it will execute when It will call. (not by jvm) 
 	whereas local inner class can’t create main method.*/
public class Nineth_Static_A {
	
	static class B{
		int j = 20;
		public static void main(String[] args) {
			int i = 100;
			System.out.println(i);						 
			//Error: can't make reference to non-static field.
			//System.out.println(j);
		}
	}
	public static void main(String[] args) {
		System.out.println("Main A");
		B b1 = new B();
		System.out.println(b1.j);		
		System.out.println("Inner Class Main B");
		B.main(null);
	}
}
