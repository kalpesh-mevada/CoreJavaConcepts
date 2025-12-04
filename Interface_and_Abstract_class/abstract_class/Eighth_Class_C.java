package abstract_class;

public class Eighth_Class_C extends Eighth_Abstarct_B{
	
	public static void main(String[] args) {
		Eighth_Class_C c1 = new Eighth_Class_C();
		c1.testA();
		c1.testB();
	}

	@Override
	public void testA() {
		System.out.println("Abstract Class A abstract method");		
	}

	@Override
	public void testB() {
		System.out.println("Abstract Class B abstarct method");		
	}
}
