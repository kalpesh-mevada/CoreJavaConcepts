package interface_p1;

/*	Every method of interface,it must be complete in class 
 	which is implemented in class
*	We inherit the member of interface which is incomplete 
	and then we override with complete method with subclass.*/
public class First_Class_B implements First_Int_A{

	public static void main(String[] args) {
		First_Class_B b1 = new First_Class_B();
		b1.test();
		b1.test3();
	}
	
	@Override
	public void test() {
		System.out.println("Completed Method test");
	}
	
	@Override
	public void test3() {
		System.out.println("Completed Method test3");
	}	
}
