package interviewQuestion;

public class Fifth_Equals_A {
	public static void main(String[] args) {
		String s1 =	"A";
		String s2 = new String("A");
		String s3 = "A"; //s1 object ref value replace with s3 "A"
		String s4 = new String("A"); 
		String s5 = "B"; // created new reference object for s4 "B"
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //true
		System.out.println(s4==s2); //false
		System.out.println(s1.equals(s2)); //true
	}
	
}
