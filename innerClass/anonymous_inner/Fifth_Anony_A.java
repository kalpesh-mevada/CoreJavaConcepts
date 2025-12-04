package anonymous_inner;
/*	Anonymous class can inherit the member of any other class, 
 	any other interface, local inner class and static inner 
 	class but can’t inherit member of outer class.
*/
public class Fifth_Anony_A {
	
	// static class B
	static class B{
		int i = 10;
		public void testB(){
			System.out.println("Static Inner Class");
		}
	}
	public static void main(String[] args) {
		B b = new B(){
			// Anonymous class
		};
		System.out.println(b.i);
		b.testB();
	}
}
