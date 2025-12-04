package classCastWithCastException;

public class Second_ClassDownCast_B extends Second_ClassDownCast_A {

	int j = 20;
	public static void main(String[] args) {
		//Right way to down casting as bellow
		Second_ClassDownCast_A a1 = new Second_ClassDownCast_A();
		Second_ClassDownCast_B b1 = new Second_ClassDownCast_B();
		a1 = b1;
		b1 = (Second_ClassDownCast_B)a1;
		/*	In Down casting, both parent and child class member are
		 	accessible.*/
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
	
}
