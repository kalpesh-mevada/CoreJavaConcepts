package IIBandSIB;

public class IIB_SIB_Third {
	{
		System.out.println("IIB");
	}
	IIB_SIB_Third() {
		System.out.println("CONTRUCTOR");
	}
	
	
	static{		
		System.out.println("SIB 1");
	}
	static{
		new IIB_SIB_Third();
		System.out.println("SIB 2");
	}
	
	public static void main(String[] args) {		
		System.out.println("MAIN");
	}
}
