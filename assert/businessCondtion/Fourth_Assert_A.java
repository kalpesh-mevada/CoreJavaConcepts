package businessCondtion;
/*Assert helps us to check business condition using static method.*/
public class Fourth_Assert_A {
	
	public static void main(String[] args) {
		assert test(); 
		System.out.println("From Main");
	}

	private static boolean test() {
		// TODO Auto-generated method stub
		System.out.println("From Test");
		return false;
	}
}
