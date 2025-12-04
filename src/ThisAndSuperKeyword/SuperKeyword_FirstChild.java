package ThisAndSuperKeyword;

public class SuperKeyword_FirstChild extends SuperKeyword_FirstParent  {

		
	public static void main(String[] args) {
		SuperKeyword_FirstChild b = new SuperKeyword_FirstChild();
		b.test();
		
	}
	
	public void test(){
		/*Using super keyword, we can access the member of parent class*/
		System.out.println(super.i); //access non-static member of parent class.
	}
}
