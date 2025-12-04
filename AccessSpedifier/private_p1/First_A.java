package private_p1;

/*	Example of Private Specifier Same Class
  	*/
public class First_A {
	
	private int i = 10;
	
	public static void main(String[] args) {
		First_A a1 = new First_A();
		System.out.println(a1.i);
		a1.test();
	}
	
	public void test(){
		System.out.println("Test");
	}
}
