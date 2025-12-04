package finalKeyword;

public class Third_Final_A {
	
	public static void main(String[] args) {
		Third_Final_A d1 =  new Third_Final_A();
		d1.test(10); // pass argument as 10
	}
	// final int i is local variable
	public void test(final int i){
		//i = 30; // re initialization can't possible.
		System.out.println(i);
	}
}
