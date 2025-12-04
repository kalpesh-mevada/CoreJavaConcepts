package static_inner;
/*Static inner class can implement interface*/
public class Eighth_Static_B {
	
	static class C implements Eighth_Interface_A{
		
		@Override
		public void test() {
			System.out.println("From Interface");
		}		
	}
	public static void main(String[] args) {
		C c = new C();
		c.test();
	}
}
