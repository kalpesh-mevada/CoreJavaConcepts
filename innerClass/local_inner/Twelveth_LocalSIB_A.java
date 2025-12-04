package local_inner;
/*SIB can't be kept inside local inner class.*/
public class Twelveth_LocalSIB_A {
	class B{
	/*ERROR : Cannot define static initializer in inner type 
		Twelveth_LocalSIB_A.B*/
		
		/*static{ 
			System.out.println("From SIB");
		}*/
	}
	public static void main(String[] args) {
		Twelveth_LocalSIB_A a = new Twelveth_LocalSIB_A();
		B b = a.new B();		
	}
}
