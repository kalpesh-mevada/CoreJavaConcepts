package genericClass;
/*More than one Generic class*/
public class Second_A <X,Y,Z>{
	X i;
	Y j;
	Z k;
	public static void main(String[] args) {
		Second_A a = new Second_A<>();
		a.i = 10;
		a.j = 20.3;
		a.k = 20.2f;
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
	}
}
