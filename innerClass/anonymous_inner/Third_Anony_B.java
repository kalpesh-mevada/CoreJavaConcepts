package anonymous_inner;
/*	it is capable enough to access inherited member of class.
 * 	-	Without overriding calling method of other class*/
public class Third_Anony_B {
	
	public static void main(String[] args) {
		Third_Anony_A a1 = new Third_Anony_A(){
			// Anonymous class Third_Anony_A
		};
		a1.testA();
	}
}
