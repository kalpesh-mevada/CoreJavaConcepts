package ThisAndSuperKeyword;

/* 
 * Non-static member can't access inside static context.
 * "This keyword can't be used inside static context."*/
public class ThisKeyword_Third {

	int i =10;
	static int j = 15;
	public static void main(String[] args) {
		ThisKeyword_Third a1 = new ThisKeyword_Third();
		// - ERROR
		// System.out.println(i); 
		//System.out.println(this.i);
		//System.out.println(this.j);
		//System.out.println(this);
		a1.test();
	}
	
	public static void test(){
		// - ERROR Due to Static Context
		// System.out.println(i); 
		//System.out.println(this.i);
		//System.out.println(this.j);
		//System.out.println(this);
		System.out.println(j);
		
	}
	
	
}
