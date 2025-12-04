package interface_p1;

// we can never create of object of interface.
// By up casting, we can create object of interface.
public class Sixth_Class_A implements Sixth_Int_A{

	public static void main(String[] args) {
		// up casting through interface object creation
		Sixth_Int_A a1 = new Sixth_Class_A();
		a1.test();
	}

	@Override
	public void test() {
		System.out.println("Completed Method");		
	}
}
