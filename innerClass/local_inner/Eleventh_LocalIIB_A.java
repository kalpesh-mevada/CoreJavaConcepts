package local_inner;
/*IIB can be created inside local inner class.*/
public class Eleventh_LocalIIB_A {
	class B{
		int i;
		//IIB
		{
			i = 10;
			System.out.println("From IIB");
		}
		//Constructor
		B(){
			System.out.println("Constructor");
		}
	}
	public static void main(String[] args) {
		Eleventh_LocalIIB_A a = new Eleventh_LocalIIB_A();
		B b = a.new B();
		System.out.println(b.i);
	}
}
