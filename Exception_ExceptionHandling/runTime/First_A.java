package runTime;

/*	“When bad user input is given, program will hold abruptly 
 	halting a program abruptly is called as EXCEPTION”
 	-	here we use try catch block to handle halting statement.
 	-	Exception object created by Try block.
	-	Automatically Address of Exception given to catch*/
// RUNTIME EXCEPTION
public class First_A {
	public static void main(String[] args) {
		
		try{
			// Exception object created by Try block.
			int i = 10/0;
			System.out.println(i); // handle by try
		}
		catch(Exception e){
			// Automatically Address of Exception given to catch.
			System.out.println(e);
		}				
		System.out.println("Completed");
	}
}
