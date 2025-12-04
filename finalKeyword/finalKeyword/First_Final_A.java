package finalKeyword;

/*	“If you make a variable as final, then we can 
	never reinitialize that variable.”*/
public class First_Final_A {
	public static void main(String[] args) {
		final int i = 10;
		//i = 20; // i = 10 both we can't
		// i++; // this can't even work
		System.out.println(i);
	}
}
