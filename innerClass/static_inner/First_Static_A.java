package static_inner;
/*	In this class we can keep static and non-static member both.
  	-	static inner class does not require reference of outer
  		class for creating object of inner class
  	-	we can’t create object of static inner class to access 
  		member of outer class without inheritance*/
public class First_Static_A {
	int i = 10;
	// Static Inner Class
	static class B{
		int j = 20;
		static int k = 30;
	}
	public static void main(String[] args) {
		// not required reference of outer class
		B b = new B(); 
		System.out.println("Non-static Member: "+b.j);
		System.out.println("Static Member: "+b.k);
// ERROR: i cannot be resolved or is not a field
		//System.out.println("Outer class member: "+b.i);
	}
}
