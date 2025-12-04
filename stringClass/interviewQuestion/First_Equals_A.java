package interviewQuestion;
/*	“==”:	it compares memory address of String Object.
			- Object have multiple references.
	“equals () METHOD”: it compares value of String.
*/
public class First_Equals_A {
	public static void main(String[] args) {
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
	}
}
