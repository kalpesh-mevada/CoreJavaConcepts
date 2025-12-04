package IIBandSIB;

public class IIB_SIB_Second {
	
	{
		System.out.println("IIB 1");
	}
	IIB_SIB_Second() {
		System.out.println("CONTRUCTOR 2");
	}
	static{
		System.out.println("SIB 3");
	}
	
	public static void main(String[] args) {
		IIB_SIB_Second c = new IIB_SIB_Second();
		System.out.println("MAIN 4");
	}
}
