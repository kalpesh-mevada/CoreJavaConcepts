package over_ridding;
/*
 * Inheritance is mandatory
 * over ridding is possible only on method.
 * over ridding variable is not possible
*/
public class First_B extends First_A{
	
	@Override
	public void test(){
		System.out.println("Method of B");
	}
	
	public static void main(String[] args) {
		First_B b = new First_B();
		b.test();
	}
}
