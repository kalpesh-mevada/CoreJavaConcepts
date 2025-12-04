package P2;

import static P1.A_StaticImport_P1.i;
//not use bracket after method name, that's meaning of calling method
import static P1.A_StaticImport_P1.testStatic; 
/* Static import can access only static member and method
 * FOR All static member and method: 
   import static P1.A_StaticImport_P1.*; */

public class B_StaticImport_P2 {
	
	public static void main(String[] args) {
		System.out.println(i);
		// static method
		testStatic();
	}
}
