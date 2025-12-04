package runTime;

/*Runtime Null Pointer Exception Example*/
public class Third_A {
	static Third_A a; // Object declare without initialize by new
	int i = 10;
	
	public static void main(String[] args) {
		
		// without addressing we access member
		try{
			System.out.println(a.i);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("completed");	
	}
}
