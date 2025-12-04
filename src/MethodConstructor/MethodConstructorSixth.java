package MethodConstructor;


public class MethodConstructorSixth {
	int i = 10;
	
	void MethodConstructorSixth(){
		System.out.println("Method A");
	}
	
	MethodConstructorSixth(){
		System.out.println("CONSTRUCTOR");
	}
	
	public static void main(String[] args) {
		// Output - Constructor will call first because object created before method call.		
		new MethodConstructorSixth().MethodConstructorSixth();
		
		// Output - Constructor will call first because object created before calling integer value.
		System.out.println(new MethodConstructorSixth().i);
	}
}
