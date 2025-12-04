package override;
/*	This annotation helps to check whether we are 
 	overriding a method or not.*/
public class First_B extends First_A {
	
	@Override // compiler will check
	public void test(){
		System.out.println("Test B");
	}
	public static void main(String[] args) {
		First_B b = new First_B();
		b.test();
	}
}
