package genericClass;
/*	Generic can't applied on local variable*/
public class Fifth_A <X> {
	X i;
	X j;
	Fifth_A a1;
	// Generic type method
	public X test() {
		a1 = new Fifth_A();
		a1.i = 30.3f;
		return i;		
	}
	public static void main(String[] args) {
		Fifth_A a2 = new Fifth_A<>();
		/*	Error Cannot make a static reference to 
		 	the non-static type X*/		
		//X j = a2.test(); // Local variable
		a2.j = a2.test();
		System.out.println();
		
	}
}
