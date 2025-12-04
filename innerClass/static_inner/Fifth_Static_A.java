package static_inner;

/*Inheritance between two static inner class is possible*/
public class Fifth_Static_A {
	 int i = 10;
	 static int j = 20;
	 
	 static class B extends Fifth_Static_A{
		 public void testB(){
			 System.out.println("Inner Test B");
		 }
	 }
	 static class C extends B{
		 int k = 30;
		 static int l = 40;
	 }
	public static void main(String[] args) {
		C c = new C();
		System.out.println("Outer Non-static member: "+c.i);
		System.out.println("Outer Static member: "+c.j);
		c.testB();
		System.out.println("Inner Non-static member: "+c.k);
		System.out.println("Inner Static member: "+c.l);
	}
}
