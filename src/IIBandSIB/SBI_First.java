package IIBandSIB;

/*
* SIB run before main method & it doesn’t require any invoking statement whereas IIB required object creation.
* SIB mainly used to initialize static variable (For me only whereas IIB mainly used to initialize non-static variable).
*/
public class SBI_First {
	
	/*Static Initialize Block SIB: 
	SIB run before main method & it doesn’t require any invoking statement.
	SIB mainly used to initialize static variable (For me only whereas IIB mainly used to initialize non-static variable).*/
	
	// THIS IIB will not execute, because it must be require to invoke by object creation.
	{
		System.out.println("Instance Initialize Block (IIB)");
	}
	// THIS SIB will execute, because it can't require to invoke by object creation.
	static{
		// new SBI_First(); we can create object inside SIB.
		System.out.println("Static Initialize Block (SIB)");
	}
	public static void main(String[] args) {
		 System.out.println("Main");
	}
}
