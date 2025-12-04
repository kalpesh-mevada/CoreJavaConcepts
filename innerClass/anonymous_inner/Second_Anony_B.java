package anonymous_inner;
/*	Anonymous class automatically inherit the members of object 
	created before it.
*/
public class Second_Anony_B {
	public static void main(String[] args) {
		Second_Anony_A a1 = new Second_Anony_A(){
			public void testMethod(){
				System.out.println("Anonymous Class");
			}
		}; 
		a1.testMethod();
	}
}
