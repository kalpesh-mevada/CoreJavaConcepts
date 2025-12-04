package IIBandSIB;

public class IIB_SIB_Fifth {
	
	IIB_SIB_Fifth() {
		System.out.println("CONSTRUCTOR");
	}
	
	public void test(){
		System.out.println("Test Method");
	}
	public static void testStatic(){
		System.out.println("Test Static Method");
	}
	
	//IIB
	{		
		IIB_SIB_Fifth.testStatic();
		System.out.println("IIB");
	}
	//SIB
	static{
		//non-static Method
		new IIB_SIB_Fifth().test();
		//Static Method
		IIB_SIB_Fifth.testStatic(); // Access Static Method using static way which followed by ClassName
		
		System.out.println("SIB");
	}
	public static void main(String[] args) {
		//new IIB_SIB_Fifth();
		System.out.println("MAIN");
	}
}
