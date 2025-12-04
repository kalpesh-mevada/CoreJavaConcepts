package P2;

/* Use package without importing package
 * Syntax: packageName.member*/
public class B_DiffSyntax {

	
	public static void main(String[] args) {
		
		P1.A_DiffSyntax a1 = new P1.A_DiffSyntax();
		System.out.println(a1.i);
		new P1.A_DiffSyntax().test();
		new P1.A_DiffSyntax().test();
		System.out.println(new P1.A_DiffSyntax().i);
	}
}
