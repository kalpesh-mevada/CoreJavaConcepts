package IIBandSIB;

public class SIB_Second {

	
	static int i;
	int j; 
	
	// SIB Static Initialize Block
	// mainly use to initialize static member only.
	static{
		i = 20;
		//j = 30; we can't initialize non-static member, it will throw error.
		System.out.println("static variable: " +i);
	}
	
	/* Multiple SIB then it follows order in sequence which written first, 
	 it will execute first and so on.*/
	static {
		System.out.println("it's follow order in sequence SIB 1");
	}
	static {
		System.out.println("it's follow order in sequence SIB 2");
	}
	
	public static void main(String[] args) {
		System.out.println("SIB call before main and doesn't reauire to invoke SIB");
		System.out.println("Main");
	}
	
	static {
		System.out.println("it's follow order in sequence SIB 3");
	}
}
