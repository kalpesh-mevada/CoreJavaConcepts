package interviewQuestion;
/*	String is immutable class.
	- Garbage Collector will destroy object of old
	  memory reference.
*/
public class Sixth_ImmutableStr_A {
	public static void main(String[] args) {
		String s1 = "A";
			s1 = "B"; // Changing value from refernce s1
			s1 = "C"; // Changing value from refernce s1
			System.out.println(s1);
	}
}
