package MethodConstructor;

public class MethodConstructorFirst {
	
	public MethodConstructorFirst() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor C");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodConstructorFirst c = new MethodConstructorFirst();		
		//we have to call method using reference variable
		c.test();
	}
	
	public void test() {
		System.out.println("Test Method");
	}

}
