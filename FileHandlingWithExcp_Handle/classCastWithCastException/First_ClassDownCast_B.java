package classCastWithCastException;
/* 	Not compile time exception, but it will Run Time Exception of 
 	Class Cast Exception*/
public class First_ClassDownCast_B extends First_ClassDownCast_A{

	int j = 20;
	public static void main(String[] args) {
	/*In down casting, its mandatory to written down syntax like bellow.
		First_ClassDownCast_B b1 = (First_ClassDownCast_B) new First_ClassDownCast_A();	
		*/
	 try{
		// Error: ClassCastException, This is not right way for down casting 
		First_ClassDownCast_B b1 = (First_ClassDownCast_B) new First_ClassDownCast_A();
		System.out.println(+b1.i + " , " +b1.j);
	 }catch(ClassCastException e){
		System.out.println(e);
	 }		
	}
}
