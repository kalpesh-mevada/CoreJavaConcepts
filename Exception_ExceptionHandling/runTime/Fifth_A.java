package runTime;
/*Object declare as Null after initialize by new*/
public class Fifth_A {

	//Reference variable Null - NullPointerException
	static Fifth_A a1 = null; // declare null object
	int i = 10;
	
	Fifth_A(Fifth_A a2){ // Constructor
		try{
			System.out.println(a2.i);
			
		}catch(NullPointerException e){
			
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		/* after initialize by new, then only constructor 
		   will be called*/
		a1 = new Fifth_A(a1); // initialize null object
		System.out.println("Completed");
	}
}
