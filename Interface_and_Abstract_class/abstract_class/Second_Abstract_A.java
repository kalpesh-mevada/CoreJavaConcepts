package abstract_class;
/*	We can never create object of abstract class but then abstract 
	class can consist of main method.
*/
public abstract class Second_Abstract_A {
	
	int i = 10; //non-static member
	static int j = 20; // static member
	public void test(){
		System.out.println("Complete Method");
	}
	public static void main(String[] args) {
		//Error: Cannot instantiate the type Second_Abstract_A
		Second_Abstract_A a1 = new Second_Abstract_A();
		
		/* 	Warrning: The static field Second_Abstract_A.i 
		 	should be accessed in a static way*/
		System.out.println(a1.j);
		// static way to access member
		System.out.println(Second_Abstract_A.j); // work
	}
}
