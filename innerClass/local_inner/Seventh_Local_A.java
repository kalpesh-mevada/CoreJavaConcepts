package local_inner;

public class Seventh_Local_A {
	int i = 10; // outer class non-static member
	static int ii = 30; // outer class static member
	// local inner class
	class B extends Sixth_Local_A{
		int j = 20; // non-static member
		/*	ERROR:The field jj cannot be declared static; static fields 
		 	can only be declared in static or top level types*/
		//static int jj = 50; // static member
	}
	public static void main(String[] args) {
		Seventh_Local_A a = new Seventh_Local_A();
		B b = a.new B();
		System.out.println(b.i);
		System.out.println(b.j);
	}
}
