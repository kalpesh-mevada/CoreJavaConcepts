package MethodConstructor;

public class MethodConstructorThird {

	int i =10;
	
	public MethodConstructorThird() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor E");
	}
	
	private void test() {
		System.out.println("Test Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Memory Address Of Object Location: ClassName@HexadecimalCode: " + new MethodConstructorThird()); 
		System.out.println(new MethodConstructorThird().i); // memory address of i
		
		
		//System.out.println(new MethodConstructorThird().test()); //The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
		new MethodConstructorThird().test();
	}

}
