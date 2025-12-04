package MethodConstructor;

public class MethodConstructorFifth {
	//CONSTRUCTOR
	// Constructor will execute because there is object created in main method.
	MethodConstructorFifth(){
		System.out.println("CONSTRUCTOR I");
	}
	
	// This Method will not execute because it's not call.
	// we can make method same name as class name but it should be return something
	void MethodConstructorFifth(){
		System.out.println("METHOD I");
		//return;
	}
	
	public static void main(String[] args) {
		MethodConstructorFifth i = new MethodConstructorFifth();
		//i.MethodConstructorFifth();
		System.out.println("Main");
		
		
	}

}
