package static_inner;
/*we can create more than one static class.*/
public class Fourth_Static_A {
	
	 static class B{
		 public void testB(){
			 System.out.println("Inner Test B");
		 }
	 }
	 static class C{
		 int i = 30;
		 static int j = 40;
	 }
	public static void main(String[] args) {
		B b = new B();
		b.testB();
		C c = new C();
		System.out.println(c.i);
		System.out.println(c.j);
	}
}
