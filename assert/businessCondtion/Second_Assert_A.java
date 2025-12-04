package businessCondtion;
/*	Assert helps us to check the business condition handle
  	using try catch*/
public class Second_Assert_A {
	public static void main(String[] args) {
		int age = 100;
		try{
			// by applying 200, business condition will be false
			assert age > 20; 
			System.out.println("Regester your self");
		}catch (AssertionError e) {
			System.out.println(e);
			System.out.println("You are too young to Reg.");
		}
	}
}
