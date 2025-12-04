package local_inner;

public class Third_Local_A {
	// outer class member
		int j = 10; 
		public void testA(){
			System.out.println("Test A");
		}
		//Local Inner Class
		class B{
			int i = 20;
			public void testB(){
				System.out.println("Test B");
			}
		}
	public static void main(String[] args) {
		Third_Local_A a1 = new Third_Local_A();
		B b1 = a1.new B();
		System.out.println(b1.i);
		b1.testB();
	/* Error: The method testA() is undefined for the 
 	type Third_Local_A.B*/
		//b1.testA();
	}
}
