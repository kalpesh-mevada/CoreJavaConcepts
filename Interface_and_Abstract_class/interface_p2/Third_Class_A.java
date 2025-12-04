package interface_p2;
import interface_p1.Third_Int_A;

public class Third_Class_A implements Third_Int_A {

	public static void main(String[] args) {
		Third_Class_A a1 = new Third_Class_A();
		a1.test();
		a1.testDefault();
	}

	@Override
	public void test() {
		System.out.println("Completed Method Public");
	}

	@Override
	public void testDefault() {
		// Increasing visibility default to public.
		// Default to default not possible
		System.out.println("Completed Method Default");
	}
}
