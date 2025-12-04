package classCastWithCastException;

/*	Here Child object memory address stored in parent class
 	reference variable*/
public class First_ClassUpCast_B extends First_ClassUpCast_A{
	
	int j = 20;
	public void testB(){
		System.out.println("Test Method B");
	}
	public static void main(String[] args) {
		/*Up Casting Not mandatory to write like below
		First_ClassUpCast_A a1 = 
		(First_ClassUpCast_A)new First_ClassUpCast_B();*/
		First_ClassUpCast_A a1 = 
				(First_ClassUpCast_A)new First_ClassUpCast_B();
		System.out.println(a1.i);
		a1.testA();
		//Up Casting Error when accessing child class member
		//System.out.println(a1.j);
		//The method testB() is undefined for the type First_ClassUpCast_A
		//a1.testB();
	}
}
