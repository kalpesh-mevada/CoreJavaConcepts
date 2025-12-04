package abstract_class;

/*	Every incomplete method should be override in inheritance
 	- If abstract method not override, the error of child class
 	is add unimplemented method*/
public class Fourth_Abstract_B extends Fourth_Abstract_A{
	
	public static void main(String[] args) {
		/* 	When object is created of child class, compiler will
		 	automatically call parent class constructor.*/
		Fourth_Abstract_B b1 = new Fourth_Abstract_B();
		b1.test(); // incomplete method of abstract class
		b1.xyz(); //complete method of abstract class
	}
	@Override
	public void test() {
		System.out.println("Completed Method");
	}	
}
