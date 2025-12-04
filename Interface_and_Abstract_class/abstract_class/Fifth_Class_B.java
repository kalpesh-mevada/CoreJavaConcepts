package abstract_class;

public class Fifth_Class_B extends Fifth_Abstract_A {

	public static void main(String[] args) {
		/* 	Up Casting through we can only 
		 	create object of abstract class*/
		Fifth_Abstract_A a1 = new Fifth_Class_B();
		a1.test();
	}

	@Override
	public void test() {
		System.out.println("From Test");
	}

}
