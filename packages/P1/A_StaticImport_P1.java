package P1;
//STATIC IMPORT EXAMPLE
public class A_StaticImport_P1 {
	
	public static int i = 10; //Static Member	
	
	//Non-static method
	public void test(){
		System.out.println("From Non-Static Test");
	}
	
	public static void testStatic(){
		System.out.println("From Static Method Test");
	}
}
