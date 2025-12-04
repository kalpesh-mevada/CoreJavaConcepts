package deprecated;
/*	This annotation helps to notify that a particular 
 	method is not in used.*/
public class First_A {
	
	@Deprecated
	public void test(){
		System.out.println("From Test");
	}
	
	public static void main(String[] args) {
		First_A a = new First_A();
		a.test();
	}
}
