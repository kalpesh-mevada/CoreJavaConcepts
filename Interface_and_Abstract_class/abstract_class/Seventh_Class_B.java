package abstract_class;
/* 	It is mandatory to keep constructor with super 
	keyword with argument. when no argument in constructor
	, it will automatically call.*/
public class Seventh_Class_B extends Seventh_Abstract_A {
	
	Seventh_Class_B() {
		super(100); //abstract class constructor with args
		System.out.println("Child Class Default Constructor");
	}

	public static void main(String[] args) {
		Seventh_Class_B b1 = new Seventh_Class_B();
	}

}
