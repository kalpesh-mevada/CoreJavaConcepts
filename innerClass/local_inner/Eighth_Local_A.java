package local_inner;
/*Static member of outer class can be inherited into local inner 
class but then static member can’t be created in local inner class
*/
public class Eighth_Local_A {
	int i = 10; // outer class non-static member
	static int ii = 30; // outer class static member
	// local inner class
	class B extends Eighth_Local_A{
		int j = 20; // non-static member
		//Error:
		//static int jj = 50; // static member
	}
	public static void main(String[] args) {
		Eighth_Local_A a = new Eighth_Local_A();
		B b = a.new B();
		System.out.println(b.i);
		
	}
}
