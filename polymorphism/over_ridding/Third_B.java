package over_ridding;

public class Third_B extends Third_A {

	@Override
	public void test1(){
		System.out.println("Method Test B");
	}	
	
	public static void main(String[] args) {
		Third_B b = new Third_B();
		b.test1();
		b.test2();
	}
}
