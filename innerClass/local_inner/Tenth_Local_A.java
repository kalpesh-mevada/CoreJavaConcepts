package local_inner;
/*	Inheritance between two local inner class is
  	possible.*/
public class Tenth_Local_A {
	class B{
		int i = 10; // inner class member
	}
	class C extends B{
		int j = 20; // inner class member
	}
	public static void main(String[] args) {
		Tenth_Local_A a = new Tenth_Local_A();
		C c = a.new C();
		System.out.println("inner class B: "+c.i);
		System.out.println("inner class C: "+c.j);
	}
}
