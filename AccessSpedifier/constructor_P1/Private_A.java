package constructor_P1;
/*
 * 	“If you create constructor as PRIVATE, then it’s object 
 	can be created in the same class, but then we can’t 
 	create its object in different class.”
	- accessibility only in same class.
*/
public class Private_A {
	
	// Private Constructor
	private Private_A(){
		System.out.println("Private Constructor A");
	}
	
	public static void main(String[] args) {
		Private_A a = new Private_A();
	}
}
