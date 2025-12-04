package local_inner;
/*we can create more than one local inner class*/
public class Nineth_Local_A {	
	class B{
		int i = 10;
		public void testB(){
			System.out.println("Test B");
		}
	}
	class C{
		int j = 20;
	}

	public static void main(String[] args) {
		Nineth_Local_A a = new Nineth_Local_A();
		
		B b = a.new B();
		System.out.println(b.i);
		b.testB();
		
		C c = a.new C();		
		System.out.println(c.j);
	}
}
