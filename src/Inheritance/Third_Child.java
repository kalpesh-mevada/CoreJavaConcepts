package Inheritance;

public class Third_Child extends Third_Parent {

	public static void main(String[] args) {
		Third_Child b = new Third_Child();
		b.test();
		Third_Parent.testStatic();
		b.testStatic();
	}

}
