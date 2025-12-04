package abstract_class;
/*	A Constructor will call when object created of child class or 
 	else abstract parent class object is created by up casting 
 	while inheritance*/
public class Sixth_Class_B extends Sixth_Abstract_A{

	public static void main(String[] args) {
		Sixth_Class_B b1 = new Sixth_Class_B();
		b1.test();
	}
	@Override
	public void test() {
		System.out.println("Completed method");
		
	}		
}
