package abstract_class;

public abstract class Fourth_Abstract_A {
	// Default Constructor
	Fourth_Abstract_A(){
		System.out.println("Constructor Of Abstract Class");
	}
	// only abstract class have abstract method
	// abstract method should be incomplete
	public abstract void test();
	public void xyz(){
		System.out.println("complete xyz");
	}
}
