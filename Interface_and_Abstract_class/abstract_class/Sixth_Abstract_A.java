package abstract_class;
/*	A constructor can be created in abstract class.
 * 	It is mandatory to keep constructor with super 
 	keyword with argument. when no argument in constructor
 	, it will automatically call.*/
public abstract class Sixth_Abstract_A {
	// Default Constructor
	Sixth_Abstract_A(){
		System.out.println("Abstract Class Default Constructor");
	}
	public abstract void test();
}
