package static_inner;
/*Inheriting static inner class member into local inner 
 	class is possible.*/
public class Seventh_Static_A {
	// Static inner class B
	static class B{
	 	static int i = 10;
	 	int j = 20;
	}
	// Local inner class C
	class C extends B{
		int k = 30;
	}
	
	public static void main(String[] args) {
		Seventh_Static_A a = new Seventh_Static_A();
		C c = a.new C();
		System.out.println("static inner class i: "+c.i);
		System.out.println("static inner class j: "+c.j);
		System.out.println("local inner class k: "+c.k);
	}
}
