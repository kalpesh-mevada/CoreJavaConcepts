package P1;

/* visibility should be either public or default of P1.A_Packege class
   static and non-static member, if you want to use in 
   same package.
   - we can't access non-static and static member with accessing class object.
   */
public class First_B_P2 {
	
		int k = 30;
		public static void main(String[] args) {
			
			First_A_P1 a1 = new First_A_P1();
			System.out.println("Non-Static Member: "+a1.i);
			//access variable in static way using class name in same package
			System.out.println("Static Member: "+First_A_P1.j);
			
			
		}
}
