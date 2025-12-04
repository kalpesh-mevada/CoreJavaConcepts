package runTime;

// Typical Interview Question
/*Object declare does not as Null after initialize by new*/
public class Sixth_A {
	static Sixth_A a1;
	
	int i = 10;
	
	Sixth_A(Sixth_A a2){
		try{
			System.out.println(a2.i);			
		}catch(NullPointerException e){
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		/* after initialize by new, then only constructor 
		   will be called*/
		a1 = new Sixth_A(a1);
		System.out.println(a1);
	}
}
