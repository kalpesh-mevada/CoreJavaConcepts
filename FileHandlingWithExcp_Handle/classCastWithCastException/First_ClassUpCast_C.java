package classCastWithCastException;

public class First_ClassUpCast_C extends First_ClassUpCast_B{

	int k = 30;
	public void testC(){
		System.out.println("Test Method C");
	}
	public static void main(String[] args) {
		First_ClassUpCast_B b1 = new First_ClassUpCast_C();
		System.out.println(b1.i);
		System.out.println(b1.j);
		// Child class member and method can't accessible
		//System.out.println(b1.k);
		b1.testA();
		b1.testB();
		/* Error: The method testC() is undefined for the 
		type First_ClassUpCast_B*/
		//b1.testC();
	}
}