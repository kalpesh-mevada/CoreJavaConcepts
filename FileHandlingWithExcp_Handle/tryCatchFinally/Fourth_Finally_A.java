package tryCatchFinally;
/*Creating Exception without catch handling block.*/
public class Fourth_Finally_A {

	public static void main(String[] args) {
		try{
			int i = 10/0;
		}finally{
			System.out.println("Hello\n");
		}
		/*catch(Exception e){ // Syntax Error
			System.out.println(e);
		}*/
		System.out.println("Compeleted");
	}
}
