package static_inner;
/*Inside Static inner, we can keep SIB, IIB, Constructor*/
public class Second_Static_A {
	
	// Static Inner Class
	static class B{
		//SIB
		static{ 
			System.out.println("SIB");
		}
		// Constructor
		B(){
			System.out.println("Constructor");
		}
		//IIB
		{
			System.out.println("IIB");
		}
	}
	public static void main(String[] args) {
		B b = new B();
	}
}
