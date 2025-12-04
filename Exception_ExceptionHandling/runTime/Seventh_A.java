package runTime;

/*Not NullPointerException Example*/
public class Seventh_A {
	
	static Seventh_A a1; // without null declare
	int i = 10;
	Seventh_A(){ // Default Constructor
		System.out.println("No Argument");
	}
	Seventh_A(Seventh_A a2){ // Parameterized Constructor
		try{			
			System.out.println(a2.i);
		}catch(NullPointerException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Seventh_A a1  = new Seventh_A();
		// Suppling Reference to Parameterized Constructor
		new Seventh_A(a1);
	}
}
