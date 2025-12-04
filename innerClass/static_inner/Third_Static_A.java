package static_inner;
/*	Without inheritance we can’t access outer 
 	class member in static inner class
*/
public class Third_Static_A {
	 int i = 10;
	 static int j = 20;
	 static class B extends Third_Static_A{
		 
	 }
	public static void main(String[] args) {
		B b = new B();
		System.out.println("Outer Non-static member: "+b.i);
		System.out.println("Outer Static member: "+b.j);
	}
}
