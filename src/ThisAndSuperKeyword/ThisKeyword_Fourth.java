package ThisAndSuperKeyword;
/*
 * "This keyword can't access local variable which inside main method or other method"*/
public class ThisKeyword_Fourth {

	int i = 10;
	static int j = 20;
	public static void main(String[] args) {
		ThisKeyword_Fourth a1 = new ThisKeyword_Fourth();
		a1.test();
	}
	
	//Non-Static Context	
	public void test(){
		System.out.println(this);
		System.out.println(this.i);
		System.out.println(this.i);
		System.out.println(j);
		System.out.println("From Non-Static Context Test");
		
		
		//Hence "This keyword can't access local variable which inside main method or other method"
		int k = 30;
		//System.out.println(this.k); // ERROR - k cannot be resolved or is not a field
		
	}
}
