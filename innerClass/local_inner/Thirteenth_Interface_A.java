package local_inner;
/*	Local inner class can not only inheriting class but it can 
 	also implements interface*/
public class Thirteenth_Interface_A {
	
	class C implements Thirteenth_Interface_B{
		
		@Override
		public void testInterface() {
			System.out.println("From Interface");
		}
		
	}
	public static void main(String[] args) {
		Thirteenth_Interface_A a = new Thirteenth_Interface_A();
		C c = a.new C();
		c.testInterface();
	}
}
