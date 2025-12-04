package genericClass;
/*	Generic Method which can return anything.
 *	problem with that, we have to create again and again object 
 	to call method*/
public class Fourth_A <X> {
	X i;
	Fourth_A a1;
	
	// Generic type method
	public X test() {
		a1 = new Fourth_A();
		a1.i = 30.3f;
		return i;		
	}
	public static void main(String[] args) {
		Fourth_A a2 = new Fourth_A<>();
		a2.test();
		System.out.println();
	}
}
