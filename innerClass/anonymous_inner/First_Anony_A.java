package anonymous_inner;
/*	Anonymous class automatically inherit the members of object 
	created before it.
	-	Object creation mandatory. 
	-	class have no any name

*/
public class First_Anony_A {
	public static void main(String[] args) {
		First_Interface_B b1 = new First_Interface_B() {
			@Override
			public void testInterface() {
				System.out.println("Overided Incompele B");
			}
		};
		b1.testInterface();
	}
}
