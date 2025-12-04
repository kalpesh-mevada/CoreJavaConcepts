package local_inner;
/*We can inherit the member of outer class into inner class and 
then access this member by creating an object of inner class.*/
public class Sixth_Local_A {
	int i = 10; // outer class non-static member
	static int ii = 30; // outer class static member
	// local inner class inheriting Outer class
	class B extends Sixth_Local_A{
		int j = 20; // non-static member
	}
	public static void main(String[] args) {
		Sixth_Local_A a = new Sixth_Local_A();
		B b = a.new B();
		/*	By inheriting outer class in local inner class, 
	 	we can access member of outer class*/
		System.out.println("Outer class Member :"+b.i);	
		System.out.println("Outer Static Member :"+Sixth_Local_A.ii);	
		System.out.println("Inner class Member :"+b.j);
	}
}
