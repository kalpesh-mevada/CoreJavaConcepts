package genericClass;
/*One Generic Type with more than one value*/
public class Third_A <X> {
	X i;
	X j;
	X k;
	public static void main(String[] args) {
		Third_A a = new Third_A<>();
		a.i = 10;
		a.j = 20.3;
		a.k = 20.2f;
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
	}
}
