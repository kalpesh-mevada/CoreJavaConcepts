package interface_abstract;

public class First_Class_C extends First_Abstract_B 
									implements First_Int_A {

	@Override
	public void testA() {
		System.out.println("Interface incomplete method A");
	}
	
	public void testC() {
		System.out.println("Method Of C");
	}
	public static void main(String[] args) {
		First_Class_C c1 = new First_Class_C();
		c1.testA(); // Interface's method 
		c1.testAbstract(); // Abstract class's method
		c1.testC(); //this class method
	}
	
	@Override
	public void testAbstract() {
		System.out.println("Abstract Class Method");		
	}
}
