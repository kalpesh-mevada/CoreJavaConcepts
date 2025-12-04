package default_p1;

/*Example of same class*/
public class First_A {
	
	int i = 10;
	void test(){
		System.out.println("Default Test");
	}
	
	public static void main(String[] args) {
		First_A a1 = new First_A();
		System.out.println(a1.i);
		a1.test();
	}
}
