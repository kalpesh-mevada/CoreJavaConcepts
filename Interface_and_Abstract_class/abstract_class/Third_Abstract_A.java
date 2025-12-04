package abstract_class;
/*	we can never create object of abstract class.
 * 	we can access static member in abstract class but 
 	we can’t access	non-static member in abstract class 
 	because we can create object	of abstract class 
 */
public abstract class Third_Abstract_A {
	
	int i = 10; //non-static member
	static int j = 20; // static member
	
	public static void main(String[] args) {
		//Cannot instantiate the type Third_Abstract_A
		//Third_Abstract_A a1 = new Third_Abstract_A();
		
		//static way to access static member
		System.out.println(Third_Abstract_A.j);
	}
}
