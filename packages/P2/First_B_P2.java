package P2;
/*Access class from different package*/
import P1.First_A_P1;

public class First_B_P2 {
	
	public static void main(String[] args) {
		First_A_P1 a1 = new First_A_P1();

		/* public int i = 10:- visibility should be public of P1.A_Packege class
		   static and non-static member, 
		   if you want to use in different package.*/
		System.out.println(a1.i);
		System.out.println(a1.j);
	}
}
